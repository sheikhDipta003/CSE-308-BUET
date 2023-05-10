package Observer_pattern.ServerToUserCommunication;

import java.util.HashMap;
import java.util.Map;

public class ServiceProvider implements Publisher {
    private HashMap<Integer,UserData> observers;
    private String currState;      //ServiceProvider object is in sole control of all this data (state of ABC server)
    private String prevState;
    private boolean feedback;
    private int userID;

    ServiceProvider(){
        observers = new HashMap<>();
        currState = "op";
        userID = 1;
    }

    @Override
    public void registerObserver(Observer ob) {
        if(ob instanceof PremiumUser){
            observers.put(userID, new UserData(ob, true, 200f));
        }
        else if(ob instanceof RegularUser){
            observers.put(userID, new UserData(ob, false, 0.0f));
        }
        userID++;
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Map.Entry<Integer,UserData> e : observers.entrySet()) {
            Observer ob = e.getValue().observer;
            if(prevState.equalsIgnoreCase("op") && currState.equalsIgnoreCase("part-down")){
                if(ob instanceof PremiumUser){
                    ob.update(currState, "Use two servers?(y/n): ", true);
                    e.getValue().isUsingBothServers = feedback;

                    if(feedback){
                        ((PremiumUser) ob).setServerState("op");
                        ob.update("op", "Service is now provided by both us and " +
                                                        "our partner DEF company", false);
                    }
                    else{
                        ob.update("part-down", "ABC server is partially down", false);
                    }
                }
                else if(ob instanceof RegularUser){
                    ob.update(currState, "Upgrade plan to premium(20$/hr) or Continue?(y/n): ", true);
                    e.getValue().isPaying = feedback;
                    e.getValue().isUsingBothServers = feedback;

                    if(feedback){
                        e.getValue().totalBill = 200.0f;
                        ((RegularUser) ob).setServerState("op");
                        ob.update("op", "Upgraded to premium, Service is now provided by both us and " +
                                "our partner DEF company", false);

                        //copy all user data from server ABC to server DEF
                        ob._notify("copying all user data from server ABC to server DEF");
                    }
                    else {
                        e.getValue().totalBill = 0.0f;
                        ob.update("part-down", "Regular plan continuing, please wait for ABC server to be fully operational"
                                , false);
                    }
                }
            }
            else if(prevState.equalsIgnoreCase("op") && currState.equalsIgnoreCase("full-down")){
                if(ob instanceof PremiumUser){
                    ((PremiumUser) ob).setServerState("op");
                    ob.update("op", "Service is now provided by our partner DEF company", false);
                }
                else if(ob instanceof RegularUser){
                    ob.update(currState, "Upgrade plan to premium(20$/hr) or Continue?(y/n): ", true);
                    e.getValue().isPaying = feedback;
                    e.getValue().isUsingBothServers = false;

                    if(feedback){
                        e.getValue().totalBill = 200.0f;
                        ((RegularUser) ob).setServerState("op");
                        ob.update("op", "Upgraded to premium, Service is now provided by both us and " +
                                "our partner DEF company", false);
                        //copy all user data from server ABC to server DEF
                        ob._notify("copying all user data from server ABC to server DEF");
                    }
                    else {
                        e.getValue().totalBill = 0.0f;
                        ob.update("part-down", "Regular plan continuing, please wait for ABC server to be fully operational"
                                , false);
                    }
                }
            }
            else if(prevState.equalsIgnoreCase("part-down") && currState.equalsIgnoreCase("op")){
                if(ob instanceof PremiumUser){
                    ((PremiumUser) ob).setServerState("op");
                    ob.update(currState, "ABC Server is now operational", false);
                }
                else if(ob instanceof RegularUser){
                    ((RegularUser) ob).setServerState("op");
                    e.getValue().isUsingBothServers = false;

                    if(e.getValue().isPaying){
                        ob.update(currState, "Total bill " + e.getValue().totalBill, false);
                        e.getValue().isPaying = false;
                    }
                    else {
                        ob.update(currState, "ABC Server is now operational", false);
                    }
                }
            }
            else if(prevState.equalsIgnoreCase("part-down") && currState.equalsIgnoreCase("full-down")){
                if(ob instanceof PremiumUser){
                    if(e.getValue().isUsingBothServers){
                        ob.update("op", "Shifted all the services to the server of DEF", false);
                    }
                    else ob.update(currState, "ABC Server is down, try again later", false);
                }
                else if(ob instanceof RegularUser){
                    ob.update(currState, "ABC Server is down, try again later", false);
                }
            }
            else if(prevState.equalsIgnoreCase("full-down") && currState.equalsIgnoreCase("op")){
                if(ob instanceof PremiumUser){
                    ob.update(currState, "ABC Server is fully operational", false);
                }
                else if(ob instanceof RegularUser){
                    if(e.getValue().isPaying){
                        ob.update(currState, "Total bill " + e.getValue().totalBill, false);
                    }
                }
            }
            else if(prevState.equalsIgnoreCase("full-down") && currState.equalsIgnoreCase("part-down")){
                if(ob instanceof PremiumUser){
                    ob.update(currState, "ABC Server is partially down", false);
                }
                else if(ob instanceof RegularUser){
                    ob.update(currState, "ABC Server is fully down", false);

                }
            }
            else{
                ob.update(currState, "", false);
            }
        }
    }

    @Override
    public void getFeedback(boolean feedback) {
        this.feedback = feedback;
    }

    //This method is called from the physical device whenever changes are detected in the readings.
    //How it is called is not our concern.
    //The only thing we need to do is to notify all observers about these changes.
    public void stateChanged(){
        notifyObservers();
    }

    //Since we will not be taking data from any physical device in this case, we are simulating these changes through this function.
    public boolean setCurrState(String newState){
        if(newState.equalsIgnoreCase("op") || newState.equalsIgnoreCase("part-down") ||
                newState.equalsIgnoreCase("full_down")){
            this.prevState = currState;
            this.currState = newState;
            stateChanged();
            return true;
        }
        return false;
    }

    public String getCurrState() {
        return currState;
    }
}

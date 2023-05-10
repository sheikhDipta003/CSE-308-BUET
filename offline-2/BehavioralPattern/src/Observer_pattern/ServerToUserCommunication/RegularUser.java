package Observer_pattern.ServerToUserCommunication;

import java.util.Scanner;

public class RegularUser implements Observer{
    private String serverState;
    private Publisher serviceProvider;

    RegularUser(Publisher serviceProvider){
        this.serviceProvider = serviceProvider;
        serviceProvider.registerObserver(this);
    }

    @Override
    public void update(String serverState, String text, boolean needsFeedback) {
        this.serverState = serverState;
        System.out.println("<regular,IN>: Current state of ABC server: " + this.serverState);
        if(!text.isEmpty()){
            System.out.println("<regular,IN>: " + text);
            if(needsFeedback){
                Scanner scanner = new Scanner(System.in);
                serviceProvider.getFeedback(scanner.nextLine().equalsIgnoreCase("y"));
            }
        }
    }

    @Override
    public void _notify(String message) {
        System.out.println("<regular,IN>: " + message);
    }

    public void setServerState(String serverState) {
        this.serverState = serverState;
    }
}

package offline_1_q2;

public class CarFactory{
    public Car getCar(String userLocation){
        if(userLocation == null)    return  null;

        if(userLocation.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        else if(userLocation.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if(userLocation.equalsIgnoreCase("USA")){
            return new Tesla();
        }

        return null;
    }
}
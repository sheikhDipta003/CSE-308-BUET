package Observer_pattern.ServerToUserCommunication;

import java.util.Scanner;

public class PremiumUser implements Observer {
    private String serverState;
    private Publisher serviceProvider;

    PremiumUser(Publisher serviceProvider){
        this.serviceProvider = serviceProvider;
        serviceProvider.registerObserver(this);
    }

    @Override
    public void update(String serverState, String text, boolean needsFeedback) {
        this.serverState = serverState;
        System.out.println("<premium,IN>: Current state of server: " + this.serverState);
        if(!text.isEmpty()){
            System.out.println("<premium,IN>: " + text);
            if(needsFeedback){
                Scanner scanner = new Scanner(System.in);
                serviceProvider.getFeedback(scanner.nextLine().equalsIgnoreCase("y"));
            }
        }
    }

    @Override
    public void _notify(String message) {
        System.out.println("<premium,IN>: " + message);
    }

    public void setServerState(String serverState) {
        this.serverState = serverState;
    }
}

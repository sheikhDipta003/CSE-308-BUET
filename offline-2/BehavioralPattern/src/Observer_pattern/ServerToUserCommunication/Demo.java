package Observer_pattern.ServerToUserCommunication;

import java.util.Scanner;

//simulates ABC server
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceProvider serviceProvider = new ServiceProvider();    //create the publisher

        //create two user types
        new PremiumUser(serviceProvider);
        new RegularUser(serviceProvider);

        //change data (in real life, these data will come from some physical devices)
        while(true){
            System.out.println("<S>: Enter state of the server(op/part-down/full-down): ");
            if(!serviceProvider.setCurrState(scanner.nextLine())) System.out.println("Wrong input");
        }
    }
}

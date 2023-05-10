package offline_1_q2;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();

        while(true) {
            System.out.print("\nEnter your location: ");
            String loc = scanner.nextLine();
            if (loc.equalsIgnoreCase("quit")) break;
            Car c = carFactory.getCar(loc);
            if(c != null){
                c.setColor();
                c.setManufacturingCountry();
                c.setEngine();
                c.setDriveTrain();
                c.showCarDetails();
            }
            else System.out.println("Error");
        }
    }
}
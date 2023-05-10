package offline_1_q1;
import java.util.ArrayList;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        Director dir = new Director();
        Scanner scanner = new Scanner(System.in);
        ArrayList<PC> orders = new ArrayList<>();

        do {
            System.out.print("\n: ");
            String placeOrder = scanner.nextLine();
            if(placeOrder.equalsIgnoreCase("O")) {
                System.out.println("Enter type of pc: ");
                String pcType = scanner.nextLine();

                if (pcType.equalsIgnoreCase("Gaming")) {
                    PCBuilder builder = new GamingPC();
                    dir.build(builder);
                    PC p1 = builder.getPC();
                    orders.add(p1);
                } else if (pcType.equalsIgnoreCase("Regular-1")) {
                    PCBuilder builder = new RegularPC1();
                    dir.build(builder);
                    PC p1 = builder.getPC();
                    orders.add(p1);
                } else if (pcType.equalsIgnoreCase("Regular-2")) {
                    PCBuilder builder = new RegularPC2();
                    dir.build(builder);
                    PC p1 = builder.getPC();
                    orders.add(p1);
                } else if (pcType.equalsIgnoreCase("Regular-3")) {
                    PCBuilder builder = new RegularPC3();
                    dir.build(builder);
                    PC p1 = builder.getPC();
                    orders.add(p1);
                }
            }
            else if(placeOrder.equalsIgnoreCase("E")){
                if(orders.size() == 0)  {
                    System.out.println("Minimum 1 pc must be ordered");
                }
                else{
                    System.out.println(orders.size());
                    for(int i = 0; i < orders.size(); i++){
                        System.out.println("\n<---------Order-" + (i+1) +  "--------->");
                        orders.get(i).showDetails();
                    }
                    break;
                }
            }
            else {
                System.out.println("Invalid char. Press 'O'(order) or 'E'(quit)");
            }
        } while (true);
    }
}

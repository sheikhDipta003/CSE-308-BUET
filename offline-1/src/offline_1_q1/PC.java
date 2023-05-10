package offline_1_q1;
import java.util.LinkedList;

public class PC{
    private LinkedList<PCpart> parts;
    public PC(){ parts = new LinkedList<>(); }
    public void add(PCpart part){ parts.addLast(part); }
    public void showDetails(){
        //show the complete specification of the pcs ordered
        //name of the base and added components
        //total price
        //individual component's price (both base and added)
        int tot_price = 0;

        for (PCpart part : parts) {
            tot_price += part.totCost();
        }

        for (PCpart part : parts) {
            if(part.getCount() != 0){
                System.out.print(part.getName() + ", price = " + part.getPrice() + ", number of purchase = " + part.getCount() + "\n");
            }
        }

        System.out.print("\nTotal price = " + tot_price + "$\n");
    }
}

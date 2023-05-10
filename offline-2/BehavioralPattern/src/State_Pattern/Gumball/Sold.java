package State_Pattern.Gumball;

public class Sold extends State{
    Sold(GumballMachine gm){
        machine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, your gumball is being prepared.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have already turned the crank, cannot cancel order.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank two times will not give you two gumballs!");
    }
}

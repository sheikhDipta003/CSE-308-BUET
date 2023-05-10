package State_Pattern.Gumball;

public class SoldOut extends State{
    SoldOut(GumballMachine gm){
        machine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter, but there is no gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have turned, but no gumball to dispense.");
    }
}

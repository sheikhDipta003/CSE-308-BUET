package State_Pattern.Gumball;

public class NoQuarter extends State{
    NoQuarter(GumballMachine gm){
        machine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter.");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted any quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have turned the crank, but there is no quarter.");
    }
}

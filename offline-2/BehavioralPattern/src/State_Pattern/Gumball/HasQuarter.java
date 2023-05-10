package State_Pattern.Gumball;

public class HasQuarter extends State{
    HasQuarter(GumballMachine gm){
        machine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert two quarters at once.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank...");
        machine.setState(machine.getSoldState());
    }
}

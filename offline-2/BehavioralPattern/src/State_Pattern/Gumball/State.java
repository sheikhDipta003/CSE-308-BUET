package State_Pattern.Gumball;

abstract class State {
    protected GumballMachine machine;
    abstract void insertQuarter();
    abstract void ejectQuarter();
    abstract void turnCrank();
    void dispense(){
        //System.out.println("Dispensed...");
        //machine.count--;      //dispensing and adjusting the count needs to be done by GumballMachine, not by any state
        machine.releaseBall();
        if(machine.getCount() > 0)   machine.setState(machine.getNoQuarterState());
        else{
            machine.setState(machine.getSoldOutState());
            machine.refill(5);
        }
    }
}

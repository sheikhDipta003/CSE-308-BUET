package State_Pattern.Gumball;

public class Client {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine);
    }
}

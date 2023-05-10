package State_Pattern.Vending_machine;

public class NoQuarterState implements State {
    VendingMachine vendingMachine;
 
    public NoQuarterState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
 
	public void insertAmount() {
		System.out.println("You inserted: " + vendingMachine.getAmountGiven() + " cents.");
		vendingMachine.setState(vendingMachine.getHasQuarterState());
	}
 
	public void ejectExcessAmount() {
		System.out.println("There is no quarter to eject.");
	}

	@Override
	public void promptForExactAmount() {
		System.out.println("No amount entered yet.");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	public void refill() { }
 
	public String toString() {
		return "WAITING FOR QUARTER";
	}
}

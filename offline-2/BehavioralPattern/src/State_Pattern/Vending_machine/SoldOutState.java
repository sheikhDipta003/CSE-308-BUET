package State_Pattern.Vending_machine;

public class SoldOutState implements State {
    VendingMachine vendingMachine;
 
    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
 
	public void insertAmount() {
		System.out.println("You can't insert any amount, the machine is sold out");
		this.ejectExcessAmount();
	}
 
	public void ejectExcessAmount() {
		if(vendingMachine.getAmountGiven() > 0){
			System.out.println("Excess amount ejected: " + vendingMachine.getAmountGiven());
			vendingMachine.setAmount(0);
		}
	}

	@Override
	public void promptForExactAmount() {}

	public void dispense() {}
	
	public void refill() { 
		vendingMachine.setState(vendingMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "SOLD OUT";
	}
}

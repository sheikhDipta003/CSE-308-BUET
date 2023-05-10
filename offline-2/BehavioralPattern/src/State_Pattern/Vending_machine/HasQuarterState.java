package State_Pattern.Vending_machine;

public class HasQuarterState implements State {
	VendingMachine vendingMachine;
 
	public HasQuarterState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
  
	public void insertAmount() {
		System.out.println("You can't insert again before previous delivery is complete.");
	}
 
	public void ejectExcessAmount() {
		System.out.println("Excess cannot be returned because cold drink is not delivered yet.");
	}

	@Override
	public void promptForExactAmount() {		//false if goes to noQuarter state, true if goes to soldState
		int required = vendingMachine.getPrice() - vendingMachine.getAmountGiven();
		if(required > 0){
			System.out.println(required + " cents more is required to buy this drink.");
			vendingMachine.setState(vendingMachine.getNoQuarterState());
		}
		else{
			vendingMachine.setState(vendingMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No cold drink dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "PROCESSING THE AMOUNT";
	}
}

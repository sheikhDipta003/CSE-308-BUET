package State_Pattern.Vending_machine;

public class VendingMachine {
 
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
 
	private State state;
	private int count = 0;
	private int price = 25;		//price of the product = 1 quarter = 25 cents
	private int amountGiven = 0;
 
	public VendingMachine(int numColdDrinks) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numColdDrinks;
 		if (numColdDrinks > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
 
	public boolean insertAmount(int amountGiven) {
		this.setAmount(amountGiven);
		state.insertAmount();

		state.promptForExactAmount();
		if(state == soldState){
			state.ejectExcessAmount();
			state.dispense();
		}

		return state == soldOutState;
	}
 
	public void ejectExcessAmount() {
		state.ejectExcessAmount();
	}

	public void promptForExactAmount(){state.promptForExactAmount();}
 
	public void releaseBall() {
		System.out.println("A cold drink comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}
	public void setAmount(int amountGiven) {		//in cents
		this.amountGiven = amountGiven;
	}
	public int getAmountGiven() {
		return amountGiven;
	}
	public int getPrice() {
		return price;
	}

	public void refill(int count) {
		this.count += count;
		System.out.println("\n<---The vending machine was just refilled; its new count is: " + this.count + "-->");
		state.refill();
	}

	public void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		return "\nINVENTORY: " + count + " COLD DRINK(S)." +
				"\nPRICE PER CAN: " + price + " CENTS.\n" +
				"MACHINE IS " + state + "\n";
	}
}

package State_Pattern.Vending_machine;

public interface State {
 
	void insertAmount();
	void ejectExcessAmount();
	void promptForExactAmount();
	void dispense();
	void refill();
}

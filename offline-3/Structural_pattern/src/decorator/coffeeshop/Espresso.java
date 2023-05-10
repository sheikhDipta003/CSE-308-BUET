package decorator.coffeeshop;

public class Espresso extends Beverage {
	private double costCoffeeBeans;
	public Espresso(int quantity) {
		super(quantity);
		description = "Espresso, CoffeeBeans";
		costCoffeeBeans = 30;
	}
  
	public double cost() {
		return (super.cost() + costCoffeeBeans * getQuantity());
	}
}


package decorator.coffeeshop;

public class Mocha extends Beverage {
	private double costMilk;
	public Mocha(int q) {
		super(q);
		description = "Mocha, Milk";
		costMilk = 50;
	}

	public double cost() {
		return (super.cost() + costMilk * getQuantity());
	}
}

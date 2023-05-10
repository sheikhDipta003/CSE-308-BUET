package decorator.coffeeshop;

public class Beverage {
	String description;
	private double costMug;
	private int quantity;
	Beverage(){
		description = "Unknown Beverage";
		costMug = 100;
		this.quantity = 0;
	}
	Beverage(int q){
		description = "Unknown Beverage";
		costMug = 100;
		this.quantity = q;
	}
	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public double cost(){return costMug * quantity;}
}

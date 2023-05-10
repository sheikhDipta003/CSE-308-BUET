package decorator.coffeeshop;

public class Americano extends Beverage{
    private double costCoffeeBeans;
    public Americano(int quantity) {
        super(quantity);
        description = "Americano, CoffeeBeans";
        costCoffeeBeans = 30;
    }

    public double cost() {
        return (super.cost() + costCoffeeBeans * getQuantity());
    }
}

package decorator.coffeeshop;

public class Cinnamon extends CondimentDecorator{
    private double costCinnamon = 50;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon";
    }

    public double cost() {
        return (costCinnamon * beverage.getQuantity() + beverage.cost());
    }
}

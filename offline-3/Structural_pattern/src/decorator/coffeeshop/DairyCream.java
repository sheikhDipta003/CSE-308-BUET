package decorator.coffeeshop;

public class DairyCream extends CondimentDecorator{
    private double costDairy = 40;
    public DairyCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", DairyCream";
    }

    public double cost() {
        return (costDairy * beverage.getQuantity() + beverage.cost());
    }
}

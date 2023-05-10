package decorator.coffeeshop;

public class CoffeeBeans extends CondimentDecorator{
    private double costCoffeeBeans = 30;

    public CoffeeBeans(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", CoffeeBeans";
    }

    public double cost() {
        return (costCoffeeBeans * beverage.getQuantity() + beverage.cost());
    }
}

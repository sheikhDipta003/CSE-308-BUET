package decorator.coffeeshop;

public class ChocolateSauce extends CondimentDecorator{
    private double costSauce = 60;

    public ChocolateSauce(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", ChocolateSauce";
    }

    public double cost() {
        return (costSauce * beverage.getQuantity() + beverage.cost());
    }
}

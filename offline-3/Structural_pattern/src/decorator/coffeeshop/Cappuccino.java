package decorator.coffeeshop;

public class Cappuccino extends Beverage{
    private double costMilk;
    public Cappuccino(int q) {
        super(q);
        description = "Cappuccino, Milk";
        costMilk = 50;
    }

    public double cost() {
        return (super.cost() + costMilk * getQuantity());
    }
}

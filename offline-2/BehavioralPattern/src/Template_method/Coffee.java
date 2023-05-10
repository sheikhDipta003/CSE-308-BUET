package Template_method;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Brewing coffee grinds");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk into the coffee");
    }
}

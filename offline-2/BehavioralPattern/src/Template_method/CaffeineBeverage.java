package Template_method;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){ //contains definition of the skeleton of an algorithm
        boilWater();
        brew();         //lets subclasses redefine/control some parts of this algo
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void boilWater() {
        System.out.println("Boiling the water");
    }
}

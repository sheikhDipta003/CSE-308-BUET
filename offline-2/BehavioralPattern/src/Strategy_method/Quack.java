package Strategy_method;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can quack normally");
    }
}

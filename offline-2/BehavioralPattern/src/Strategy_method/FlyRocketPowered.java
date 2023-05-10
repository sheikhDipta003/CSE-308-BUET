package Strategy_method;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly with a rocket");
    }
}

package Strategy_method;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}

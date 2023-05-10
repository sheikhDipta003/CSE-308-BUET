package Strategy_method;

public class WoodenDuck extends Duck{
    WoodenDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    void display(){
        System.out.println("I am a wooden duck");
    }
}

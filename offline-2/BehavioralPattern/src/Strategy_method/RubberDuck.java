package Strategy_method;

public class RubberDuck extends Duck{
    RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    void display(){
        System.out.println("I am a rubber duck");
    }
}

package Strategy_method;

public class MallardDuck extends Duck{
    MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    void display(){
        System.out.println("Look at me! I am a real mallard duck");
    }
}

package Strategy_method;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();
    void performFly(){flyBehavior.fly();}
    void setFlyBehavior(FlyBehavior fb){this.flyBehavior = fb;}     //to change fly behavior dynamically
    void performQuack(){quackBehavior.quack();}
    void setQuackBehavior(QuackBehavior qb){this.quackBehavior = qb;}   //to change quack behavior dynamically
}

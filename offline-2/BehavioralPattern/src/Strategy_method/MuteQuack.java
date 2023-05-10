package Strategy_method;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Cannot quack or squeak");
    }
}

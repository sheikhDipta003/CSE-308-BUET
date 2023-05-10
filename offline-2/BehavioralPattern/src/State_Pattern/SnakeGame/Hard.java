package State_Pattern.SnakeGame;

public class Hard implements State{
    private Context cxt;

    @Override
    public void ChangeState(Context cxt) {}

    Hard(){
        this.setFoodInt();
        this.setPointsCalc();
        this.setSpeed();
    }

    @Override
    public void setFoodInt() {
        snake.setFoodInterval(30);
    }

    @Override
    public void setSpeed() {
        snake.setSpeed(30);
    }

    @Override
    public void setPointsCalc() {
        snake.setPoints_inc(30);
    }
}

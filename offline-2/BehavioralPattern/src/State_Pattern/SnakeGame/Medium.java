package State_Pattern.SnakeGame;

public class Medium implements State{
    private Context cxt;

    @Override
    public void ChangeState(Context cxt) {
        if(snake.getPoints() > 100){
            cxt.changeState(new Hard());
            System.out.print("<----Hard---->\n");
        }
    }

    Medium(){
        this.setFoodInt();
        this.setPointsCalc();
        this.setSpeed();
    }

    @Override
    public void setFoodInt() {
        snake.setFoodInterval(20);
    }

    @Override
    public void setSpeed() {
        snake.setSpeed(20);
    }

    @Override
    public void setPointsCalc() {
        snake.setPoints_inc(20);
    }
}

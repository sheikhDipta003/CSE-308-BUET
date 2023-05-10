package State_Pattern.SnakeGame;

public class Easy implements State{

    @Override
    public void ChangeState(Context cxt) {
        if(snake.getPoints() > 50){
            cxt.changeState(new Medium());
            System.out.print("<----Medium---->\n");
        }
        else if(snake.getPoints() > 100){
            cxt.changeState(new Hard());
            System.out.print("<----Hard---->\n");
        }
    }

    Easy(){
        this.setFoodInt();
        this.setPointsCalc();
        this.setSpeed();
    }

    @Override
    public void setFoodInt() {
        snake.setFoodInterval(10);
    }

    @Override
    public void setSpeed() {
        snake.setSpeed(10);
    }

    @Override
    public void setPointsCalc() {
        snake.setPoints_inc(10);
    }
}

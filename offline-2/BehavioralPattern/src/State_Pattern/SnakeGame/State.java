package State_Pattern.SnakeGame;

interface State {
    Snake snake = new Snake();
    void setFoodInt();
    void setSpeed();
    void setPointsCalc();
    void ChangeState(Context cxt);
}

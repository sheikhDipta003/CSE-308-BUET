package State_Pattern.SnakeGame;

public class Snake {
    private int foodInterval; //cm
    private int speed;  //cm/s
    private int points_inc;
    private int foodCount;
    private int totalPoints;

    Snake(){foodInterval = speed = points_inc = 10; foodCount = totalPoints = 0;}
    Snake(int foodInt, int speed, int iPoint){
        foodInterval = foodInt; this.speed = speed; points_inc = iPoint;
    }

    public int getFoodInterval() {
        return foodInterval;
    }

    public int getPoints_inc() {
        return points_inc;
    }

    public int getSpeed() {
        return speed;
    }

    public void setFoodInterval(int foodInterval) {
        this.foodInterval = foodInterval;
    }

    public void setPoints_inc(int points_inc) {
        this.points_inc = points_inc;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void consume(){this.foodCount++; this.totalPoints += this.points_inc;}
    public void hitWall(){this.totalPoints -= points_inc;}
    public int getPoints(){return this.totalPoints;}
}

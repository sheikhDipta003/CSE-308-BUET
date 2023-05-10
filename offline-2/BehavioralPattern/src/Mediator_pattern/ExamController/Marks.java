package Mediator_pattern.ExamController;

import java.util.SplittableRandom;

public class Marks {
    private float marks;
    private boolean isIncorrect;

    Marks(float marks){
        this.marks = marks;
        SplittableRandom random = new SplittableRandom();
        isIncorrect = (random.nextInt(1, 101) <= 50);
    }

    public float getMarks() {
        return marks;
    }

    public boolean isIncorrect() {
        return isIncorrect;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setIncorrect(boolean incorrect) {
        isIncorrect = incorrect;
    }
}

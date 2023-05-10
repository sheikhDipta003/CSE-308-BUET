package Mediator_pattern.ExamController;

public abstract class IStudent {
    protected IController mediator;
    protected int id;
    protected float marks;

    IStudent(IController mediator, int id){
        this.mediator = mediator;
        this.id = id;
    }

    public abstract void send(int to_id);
    public abstract void receive(Float marks);
    public abstract void receiveUpdatedMarks(float new_marks);
}

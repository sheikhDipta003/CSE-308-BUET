package Mediator_pattern.ExamController;

import java.util.Hashtable;

public abstract class IExaminer {
    protected IController mediator;
    protected int id;
    protected Hashtable<Integer, Marks> marksheet;

    IExaminer(IController mediator, int id){
        this.mediator = mediator;
        this.id = id;
        marksheet = new Hashtable<>();
    }

    public void assignMarks(int sid, float new_marks){
        marksheet.put(sid, new Marks(new_marks));
    }

    public abstract void sendToController();
    public abstract void receive(int from_id, float from_marks);
}

package Mediator_pattern.ExamController;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.SplittableRandom;

public class Examiner extends IExaminer{
    Examiner(IController md, int id){
        super(md, id);
    }

    @Override
    public void sendToController(){
        Enumeration<Integer> _enum = marksheet.keys();
        StringBuilder ids = new StringBuilder();
        while(_enum.hasMoreElements()){
            ids.append(_enum.nextElement()).append(",");
        }
        System.out.println("<E>: Scripts and marks of student id " + ids + " sent to exam controller office");
        mediator.receiveMarks(this.marksheet);
    }

    @Override
    public void receive(int from_id, float from_marks) {
        System.out.println("<E>: Re-examine request received from student id " + from_id + " through the controller");
        System.out.println("<E>: Current marks = " + from_marks);
        Marks m = marksheet.get(from_id);
        if(m.isIncorrect()){
            m.setMarks(new SplittableRandom().nextInt(33,90));
            m.setIncorrect(false);
        }
        System.out.println("<E>: Updated marks = " + m.getMarks());
        mediator.notifyChanges(from_id, m);
    }

    @Override
    public String toString() {
        return "\n<-------Examiner side: id = " + this.id + "------->";
    }
}

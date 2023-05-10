package Mediator_pattern.ExamController;
import java.util.Hashtable;
import java.util.Map;
import java.util.SplittableRandom;

abstract class IController {
    abstract void receiveMarks(Hashtable<Integer,Marks> marksheet);
    abstract void crossCheckMarks(Hashtable<Integer,Marks> marksheet);
    abstract void publishMarks(Hashtable<Integer,Marks> marksheet);
    abstract void requestReExamine(float current_marks, int from_id, int to_id);
    abstract void notifyChanges(int from_id, Marks from_marks);
    abstract void addExaminer(IExaminer examiner);
    abstract void addStudent(IStudent student);
}

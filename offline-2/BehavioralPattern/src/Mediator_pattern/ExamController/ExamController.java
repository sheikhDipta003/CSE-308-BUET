package Mediator_pattern.ExamController;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.SplittableRandom;

public class ExamController extends IController{
    ArrayList<IStudent> students;
    ArrayList<IExaminer> examiners;

    ExamController(){
        this.students = new ArrayList<>();
        this.examiners = new ArrayList<>();
    }

    @Override
    public void receiveMarks(Hashtable<Integer, Marks> marksheet) {
        System.out.println("<C>: Student id -> Marks");
        for (Map.Entry<Integer,Marks> e : marksheet.entrySet()) {
            System.out.println("<C>: " + e.getKey() + " -> "+ e.getValue().getMarks());
        }
        this.crossCheckMarks(marksheet);
    }

    @Override
    void crossCheckMarks(Hashtable<Integer,Marks> marksheet){
        System.out.println("<C>: Student id -> Previous Marks -> Corrected Marks");
        for (Map.Entry<Integer,Marks> e : marksheet.entrySet()) {
            if(e.getValue().isIncorrect()){
                System.out.print("<C>: " + e.getKey() + " -> " + e.getValue().getMarks());
                Marks corrected = new Marks(new SplittableRandom().nextInt(50,101));
                e.setValue(corrected);
                System.out.print(" -> " + e.getValue().getMarks() + "\n");
            }
        }
        this.publishMarks(marksheet);
    }

    @Override
    void publishMarks(Hashtable<Integer,Marks> marksheet) {
        for (Map.Entry<Integer,Marks> e : marksheet.entrySet()) {
            for(IStudent std: students){
                if(e.getKey() == std.id){
                    std.receive(e.getValue().getMarks());
                }
            }
        }
    }

    @Override
    public void requestReExamine(float current_marks, int from_id, int to_id) {
        System.out.println("<C>: Re-examine request got from student-id " + from_id);
        for(IExaminer e: examiners){
            if(e.id == to_id){
                e.receive(from_id, current_marks);
                break;
            }
        }
    }

    @Override
    void notifyChanges(int from_id, Marks from_marks) {
        for(IStudent std: students){
            if(std.id == from_id){
                std.receiveUpdatedMarks(from_marks.getMarks());
            }
        }
    }

    @Override
    public void addExaminer(IExaminer examiner) {
        this.examiners.add(examiner);
    }

    @Override
    public void addStudent(IStudent student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "\n<=========Exam Controller side=========>";
    }
}

package Mediator_pattern.ExamController;

public class Demo {
    public static void main(String[] args) {
        IController controller = new ExamController();
        IStudent std1 = new Student(controller, 1);
        IStudent std2 = new Student(controller, 2);
        IStudent std3 = new Student(controller, 3);
        IStudent std4 = new Student(controller, 4);
        IStudent std5 = new Student(controller, 5);
        IExaminer e1 = new Examiner(controller, 101);
        controller.addExaminer(e1);
        controller.addStudent(std1); controller.addStudent(std2);controller.addStudent(std3);
        controller.addStudent(std4);controller.addStudent(std5);

        e1.assignMarks(1, 88f);
        e1.assignMarks(2, 91f);
        e1.assignMarks(3, 75f);
        e1.assignMarks(4, 83f);
        e1.assignMarks(5, 94f);
        //examiners send all the exam scripts and corresponding marksheets to the exam controller
        e1.sendToController();
        //exam-controller scrutinizes the marks and correct mistakes(if any)
        //Then it publishes the results to the students
        //A student can apply for re-examine
        std1.send(101);
        //exam-controller then sends the corresponding exam script to the corresponding teacher
        //The teacher re-examines the script and let the exam controller know if there is any change
        //exam controller then lets the student know the results of re-examination and updates the mark
    }
}

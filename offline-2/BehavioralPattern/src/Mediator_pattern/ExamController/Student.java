package Mediator_pattern.ExamController;

public class Student extends IStudent{

    Student(IController md, int id){
        super(md, id);
    }

    @Override
    public void send(int to_id) {
        System.out.println("<" + this.id + ">: Re-examine request sent from student id " + this.id);
        mediator.requestReExamine(this.marks, this.id, to_id);
    }

    @Override
    public void receive(Float marks) {
        this.marks = marks;
        System.out.println("<" + this.id + ">: Student id " + this.id + " received marks from exam controller: " + marks);
    }

    @Override
    public void receiveUpdatedMarks(float new_marks) {
        if(this.marks != new_marks){
            this.marks = new_marks;
            System.out.println("<" + this.id + ">: Student id " + this.id +
                                    " received updated marks from exam controller: " + this.marks);
        }
        else    System.out.println("<" + this.id + ">: There is no change in the marks of student id " +
                                        this.id + ": " + this.marks);
    }

    @Override
    public String toString() {
        return "\n<-------Student side: id = " + this.id + "------->";
    }
}

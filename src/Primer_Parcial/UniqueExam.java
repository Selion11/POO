package Primer_Parcial;

public class UniqueExam extends Exam{

    public UniqueExam(String name) {
        super(name);
    }

    @Override
    public void enroll(String student){
        if(super.isEnrolled(student)){
            return;
        }
       super.enroll(student);
    }
}

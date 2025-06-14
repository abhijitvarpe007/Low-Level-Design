package BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder =studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof CSStudent){
            return createCSStudent();
        }else{
            return createMechanicalStudent();
        }
    }

    public Student createCSStudent(){
        return studentBuilder.setAge(25).setName("ABHI").setRollNo(001).setMotherName("Mother").setFatherName("Father").setSubjects().build();
    }

    public Student createMechanicalStudent(){
        return studentBuilder.setAge(24).setName("RAM").setRollNo(011).setMotherName("Mother").setFatherName("Father").setSubjects().build();
    }
}

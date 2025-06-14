package BuilderDesignPattern;

import java.util.List;

public class Student {
    int rollNo;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

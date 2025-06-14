package BuilderDesignPattern;

import java.sql.Struct;

public class Main {

    public static void main(String[] args){

        Director director1 = new Director(new CSStudent());
        Director director2 = new Director(new MechanicalStudent());

        Student cs = director1.createStudent();
        Student me = director2.createStudent();

        System.out.println(cs.toString());
        System.out.println(me.toString());

    }
}

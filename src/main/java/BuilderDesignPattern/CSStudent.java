package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CSStudent extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> sub = new ArrayList<>();
        sub.add("Computer Architecture");
        sub.add("DBMS");
        this.subjects = sub;
        return this;
    }

}

package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MechanicalStudent extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> sub = new ArrayList<>();
        sub.add("SOM");
        sub.add("TOM");
        this.subjects =sub;
        return this;
    }
}

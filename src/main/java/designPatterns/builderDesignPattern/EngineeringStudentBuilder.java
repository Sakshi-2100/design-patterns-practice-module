package designPatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DBMS");
        subjects.add("Networking");
        this.subjects = subjects;
        return this;
    }
}

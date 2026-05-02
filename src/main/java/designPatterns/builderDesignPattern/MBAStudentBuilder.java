package designPatterns.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Eco");
        subjects.add("Marketting");
        this.subjects = subjects;
        return this;
    }
}

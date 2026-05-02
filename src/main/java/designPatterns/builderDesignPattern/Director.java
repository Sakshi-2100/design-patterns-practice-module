package designPatterns.builderDesignPattern;

public class Director {
    StudentBuilder studentBuilder ;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        else if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setRollNumber(1).setAge(21).setName("A").setFatherName("Vinod").setMotherName("Sita").setSubjects().build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(2).setAge(22).setName("B").setFatherName("Binod").setMotherName("Gita").setSubjects().build();
    }
}

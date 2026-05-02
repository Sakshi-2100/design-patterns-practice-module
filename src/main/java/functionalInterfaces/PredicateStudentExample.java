package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> p2 = (student -> student.getGpa()>=3.9);


    public static void filterStudentsByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student.getName()+" "+student.getActivities());
            }
        });

    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
    }

}

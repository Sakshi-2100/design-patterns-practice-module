package designPatterns.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director obj1 = new Director(new EngineeringStudentBuilder());
        Director obj2 = new Director(new MBAStudentBuilder());
        Student engineeringStudent = obj1.createStudent();
        Student mBAStudent = obj2.createStudent();
        System.out.println("Eng"+engineeringStudent.toString());
        System.out.println("MBA"+ mBAStudent.toString());
    }
}

package designPatterns.prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("B", 20);
        Student student2 = (Student) student1.clone();
        System.out.println("Student2"+student2.name);
    }

}

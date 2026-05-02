package designPatterns.prototypeDesignPattern;

public class Student implements Prototype{
    public String name;
    private int age;
    Student(){

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(name, age);
    }
}

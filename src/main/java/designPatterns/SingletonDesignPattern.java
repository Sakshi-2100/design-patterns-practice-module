package designPatterns;

public class SingletonDesignPattern {
    private static SingletonDesignPattern obj = new SingletonDesignPattern();
    private SingletonDesignPattern(){

    }
    public static SingletonDesignPattern getInstance(){
        return obj;
    }
}

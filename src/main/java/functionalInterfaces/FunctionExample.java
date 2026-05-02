package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String > function = (s -> s.toUpperCase());
    static Function<String, String> addSomeString = (s -> s.concat(" Hey"));

    public static void main(String[] args) {
        System.out.println("Result: "+ function.apply("sakshi"));
        System.out.println("Result now "+ function.andThen(addSomeString).apply("sakshi"));

        //will do inner operation first and then the result will be passed to outer function
        System.out.println("Result 2: "+function.compose(addSomeString).apply("sakshi"));
    }
}

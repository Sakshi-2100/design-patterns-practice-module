package designPatterns.interpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> context = new HashMap<>();

    public void setContext(Map<String,Integer> context){
        this.context = context;
    }
}

package designPatterns.chainOfResponsibilityPattern;

public class DebugLogger extends Logger{

    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println(message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}

package designPatterns.chainOfResponsibilityPattern;

public class ErrorLogger extends Logger{

    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println(message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}

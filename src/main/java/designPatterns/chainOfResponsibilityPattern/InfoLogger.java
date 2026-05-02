package designPatterns.chainOfResponsibilityPattern;

public class InfoLogger extends Logger{

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println(message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}

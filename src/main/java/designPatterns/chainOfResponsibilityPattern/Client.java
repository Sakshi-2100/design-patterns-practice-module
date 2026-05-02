package designPatterns.chainOfResponsibilityPattern;

import static designPatterns.chainOfResponsibilityPattern.Logger.*;

public class Client {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(INFO, "info");
        logger.log(ERROR, "exception happens");
        logger.log(DEBUG, "debug");
    }
}

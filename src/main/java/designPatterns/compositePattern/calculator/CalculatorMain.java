package designPatterns.compositePattern.calculator;

import static designPatterns.compositePattern.calculator.Operation.*;

public class CalculatorMain {
    public static void main(String[] args) {
        Number one = new Number(1);
        Number three = new Number(3);
        Number four = new Number(4);
        Number twentyTwo = new Number(22);
        Expression addOp = new Expression(one,three,ADD);
        Expression multiplyOp = new Expression(four, addOp, MULTIPLY);
        Expression parentOp = new Expression(twentyTwo, multiplyOp, SUBTRACT);
        System.out.println(parentOp.evaluate());
    }
}

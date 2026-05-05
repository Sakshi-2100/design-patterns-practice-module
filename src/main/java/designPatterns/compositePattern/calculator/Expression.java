package designPatterns.compositePattern.calculator;

import static designPatterns.compositePattern.calculator.Operation.*;

public class Expression implements ArithmeticOperation{
    ArithmeticOperation leftExp;
    ArithmeticOperation rightExp;
    Operation operation;

    Expression(ArithmeticOperation l, ArithmeticOperation r, Operation o){
      this.leftExp = l;
      this.rightExp = r;
      this.operation = o;
    }


    @Override
    public int evaluate(){
        int value = 0;
        switch (operation){
            case ADD:
                value = leftExp.evaluate() +rightExp.evaluate();
                break;
            case SUBTRACT:
                value = leftExp.evaluate() - rightExp.evaluate();
                break;
            case MULTIPLY:
                value = leftExp.evaluate() * rightExp.evaluate();
                break;
            case DIVIDE:
                value = leftExp.evaluate() / rightExp.evaluate();
                break;
        }
        //System.out.println(value);
        return value;
    }
}

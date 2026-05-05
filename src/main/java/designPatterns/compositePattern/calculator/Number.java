package designPatterns.compositePattern.calculator;

public class Number implements ArithmeticOperation{
    int n;

    Number(int number){
        this.n = number;
    }
    @Override
    public int evaluate(){
        return n;
    }
}

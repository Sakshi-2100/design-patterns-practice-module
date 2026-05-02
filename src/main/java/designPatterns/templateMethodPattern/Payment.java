package designPatterns.templateMethodPattern;

public abstract class Payment {
    public abstract void validateReq();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();


    public final void sendMoney(){
        validateReq();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}

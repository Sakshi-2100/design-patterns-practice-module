package designPatterns.templateMethodPattern;

public class PayToFriend extends Payment{
    @Override
    public void validateReq() {
        System.out.println("Request validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("fees calculated");
    }

    @Override
    public void debitAmount() {
        System.out.println("amount debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("amount credited");
    }
}

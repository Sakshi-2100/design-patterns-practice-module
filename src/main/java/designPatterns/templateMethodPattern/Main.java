package designPatterns.templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Payment payment = new PayToFriend();
        payment.sendMoney();
    }
}

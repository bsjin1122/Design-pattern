package strategy_pattern2;

// 구체적인 전략 클래스 
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

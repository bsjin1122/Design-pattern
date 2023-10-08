package strategy_pattern2;

/* 전략 패턴 (Strategy pattern)
 * 실행 중 알고리즘을 동적으로 변경하고자 할 때 사용된다. 여러 알고리즘 중 선택하여 사용
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 다른 결제 전략을 선택하여 사용
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(200);
    }
}

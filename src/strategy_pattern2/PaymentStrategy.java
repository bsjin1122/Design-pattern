package strategy_pattern2;
// 전략 인터페이스
// 여러 구체적인 전략 클래스가 구현해야 하는 메서드를 정의
public interface PaymentStrategy {
    void pay(int amount);
}

package java.solid;

/* 5원칙 - 의존성 역전 원칙
 * 고수준 모듈(LightBulb)이 저수준 모듈(Switch)에 의존하지 않고, 추상화된 인터페이스(Switchable)에 의존하도록 변경되었다.
 * 이 코드에서 LightBulb 클래스는 Switchable 인터페이스를 사용해 스위치와 상호작용하므로 의존성 역전 원칙을 준수했다.
 * 모듈 간의 결합을 낮추고, 코드의 유지보수성과 확장성을 높일 수 있다.
 */
interface Switchable {
    void turnOn();
    void turnOff();
}

class Switch implements Switchable { // Switchable 인터페이스를 구현
    @Override
    public void turnOn() {
        // 스위치를 켜는 로직
    }

    @Override
    public void turnOff() {
        // 스위치를 끄는 로직
    }
}

class LightBulb { // Switchable 인터페이스에 의존
    private Switchable switchButton;

    public LightBulb(Switchable switchButton) {
        this.switchButton = switchButton;
    }

    public void turnOn() {
        switchButton.turnOn();
    }

    public void turnOff() {
        switchButton.turnOff();
    }
}


public class DependencyInversionPrinciple_05_DIP {
    public static void main(String[] args) {

    }
}

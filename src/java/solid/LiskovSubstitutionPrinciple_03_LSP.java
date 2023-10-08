package java.solid;

interface FlyingBird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        // 참새는 날 수 있는 구현
    }
}

class Ostrich implements FlyingBird {
    @Override
    public void fly() {
        // 타조도 날 수 없지만 fly() 메서드를 구현함
    }
}

public class LiskovSubstitutionPrinciple_03_LSP {
    public static void main(String[] args) {
        FlyingBird bird1 = new Sparrow();
        bird1.fly(); // Sparrow 클래스의 fly() 메서드가 호출됨

        FlyingBird bird2 = new Ostrich();
        bird2.fly(); // Ostrich 클래스의 fly() 메서드가 호출됨
    }
}

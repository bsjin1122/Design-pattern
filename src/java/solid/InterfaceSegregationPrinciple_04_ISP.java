package java.solid;

/* 4원칙 - 인터페이스 분리 원칙(ISP)
 * ISP를 준수하면, 인터페이스가 더 작고 응집력 있게 되어, 불필요한 의존성을 줄이고 코드의 유지보수성과 확장성을 향상시킬 수 있다.
 */

// 인터페이스를 따로 분리, 클라이언트가 자신이 사용하는 인터페이스에만 의존하도록 함
// 사용하지 않는 메서드에는 의존하지 않음
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class SuperWorker implements Workable, Eatable { // 필요한 메서드만 구현
    @Override
    public void work() {
        // 작업 로직
    }

    @Override
    public void eat() {
        // 식사 로직
    }
}

public class InterfaceSegregationPrinciple_04_ISP {
    public static void main(String[] args) {

    }
}

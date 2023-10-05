package adapter_pattern;

import java.util.TooManyListenersException;

/* 어댑터 패턴
* : 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
* 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우(O)
* */
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        TigerAdapter ot = new TigerAdapter(new OuterTiger());
        dm.쫓아내(ot);
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}


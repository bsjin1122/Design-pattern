package adapter_pattern;

/*
* 어댑터 패턴
* : 외부 요소를 기존 시스템에서 재사용하고 싶지만 아직 만들어지지 않은 경우
* : 외부 요소를 기존 시스템에서 재사용하고 싶지만 호환되지 않는 경우 (O)
*/
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

        // OuterTiger ot = new OuterTiger();
        TigerAdapter ot = new TigerAdapter(new OuterTiger());
        DoorMan dm = new DoorMan();
        dm.쫓아내(m);
        dm.쫓아내(c);
        dm.쫓아내(ot);
    }
}


package singleton_pattern;

/* 싱글톤 패턴
* 문지기를 딱 한명만 만들고 싶다.
* */
public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = DoorMan.getInstance();
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}


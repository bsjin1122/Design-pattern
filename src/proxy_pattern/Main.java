package proxy_pattern;

public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        // DoorMan dm = new DoorManProxy();
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}


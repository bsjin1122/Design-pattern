package Observer_pattern.push_observer.sub;

public class Cus3 implements Customer{

    @Override
    public void update(String msg) {
        System.out.println("손님3이 받은 알림: " + msg);
    }
}

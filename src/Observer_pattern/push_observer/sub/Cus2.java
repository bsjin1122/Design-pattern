package Observer_pattern.push_observer.sub;

public class Cus2 implements Customer{

    @Override
    public void update(String msg) {
        System.out.println("손님2가 받은 알림: " + msg);
    }
}

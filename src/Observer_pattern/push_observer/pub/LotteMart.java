package Observer_pattern.push_observer.pub;

import Observer_pattern.push_observer.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{
    // 고객 명단 필요
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void received() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("*");
                Thread.sleep(1000);
            }
            notifyChange("롯데 상품 들어왔어");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // 모든 고객 중에 등록된 손님에게 알림을 보내라
    @Override
    public void notifyChange(String msg) {
        customerList.forEach((c)-> {
            c.update(msg);
        });
    }
}

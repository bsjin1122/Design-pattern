package Observer_pattern.push_observer.pub;

import Observer_pattern.push_observer.sub.Customer;

public interface Mart {
    // 고객 등록
    void add(Customer customer);

    // 고객 해제
    void remove(Customer customer);

    // 상품 받기
    void received();

    // 알림
    void notifyChange(String msg);

}

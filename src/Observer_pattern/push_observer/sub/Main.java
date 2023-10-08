package Observer_pattern.push_observer.sub;

import Observer_pattern.push_observer.pub.LgMart;
import Observer_pattern.push_observer.pub.LotteMart;
import Observer_pattern.push_observer.pub.Mart;

/**
 * 옵저버 패턴 (Push)
 */
public class Main {
    public static void main(String[] args) {
        Mart lotteMart = new LotteMart();
        Mart lgMart = new LgMart();

        Customer cus1 = new Cus1();
        Customer cus2 = new Cus2();
        Customer cus3 = new Cus3();

        // 고객 등록 필요(구독 하기) (장점: 물어보지 않고 이렇게 구독한 해두어도 됨)
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        // 고객 등록 (구독하기)
        lgMart.add(cus3);


        // 마트 : 롯데 상품아 빨리 도착해! (10초)
        new Thread(()->{
            lotteMart.received();
        }).start();
        new Thread(()->{
            // 마트: 엘지 상품아 빨리 도착해! (5초)
            lgMart.received();
        }).start();

    }
}

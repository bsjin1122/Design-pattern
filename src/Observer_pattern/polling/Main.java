package Observer_pattern.polling;

/*
* 폴링 방식
*/
public class Main {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();
        Customer2 customer2 = new Customer2();

        new Thread(()->{
            lotteMart.received();
        }).start();

        // 한 번 물어보면 해결되지 않는다.
        while(true){

            try{
                System.out.println("상품 들어왔나요?");
                // 물어보는 시간이 짧으면? 상품이 들어온 것을 빠르게 알 수 있다. (장점: 누구보다 빨리 구매할 수 있다. 단점 : 계속 물어봐야 하니까 지친다.)
                // 물어보는 시간이 길면 상품이 들어온 것을 빠르게 알 수 없다. (장점: 덜 지친다. 단점: 구매를 못할 수 있다.)
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }


            // 어느 정도의 시간을 정해서 물어보자.폴링!!
            if(lotteMart.getValue() != null){
                customer1.update(lotteMart.getValue() + "가 들어왔습니다.");
                customer2.update(lotteMart.getValue() + "가 들어왔습니다.");
                break;
            }else {
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }
        }

    }
}

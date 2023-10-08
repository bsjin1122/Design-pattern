package Observer_pattern.polling;

public class LotteMart {
    // 상품
    private String value = null;
    public String getValue(){
        return value;
    }

    public void received(){
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
            }
            value = "상품";

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

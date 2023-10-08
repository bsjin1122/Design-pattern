package java.solid;

/* 1. 단일 책임의 원칙 (SRP)
 * 클래스가 단순하고 명확하게 정의되고 유지되도록 도와주며, 코드의 복잡성을 줄인다.
 * 변경사항이 발생했을 때 해당 클래스만 수정하면 되므로 유지보수성이 향상된다.
 */
class Customer{
    private String name;
    private double balance;

    public Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void updateBalance(double amount){
        this.balance += amount;
    }
}
// 클래스는 청구서 생성 및 전송과 관련된 역할만을 수행
class InvoiceGenerator{
    public void generateInvoice(Customer customer){
        // 고객에게 청구서를 생성하고 전송하는 로직
    }
}


public class SingleResponsibilityPrinciple_01 {
    public static void main(String[] args) {
        Customer cus = new Customer("jj", 0.23);
        InvoiceGenerator inv = new InvoiceGenerator();
        inv.generateInvoice(cus);
    }
}

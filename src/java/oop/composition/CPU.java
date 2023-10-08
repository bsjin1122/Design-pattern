package java.oop.composition;

public class CPU {
    String model;

    public CPU(String model){
        this.model = model;
    }
    public void process(){
        System.out.println(model + " CPU가 연산을 수행합니다.");
    }
}

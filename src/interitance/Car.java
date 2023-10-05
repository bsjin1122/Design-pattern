package interitance;

public class Car extends Vehicle{
    int numberOfDoors;

    public Car(String brand, int numberOfDoors){
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }
    public void drive(){
        System.out.println(brand + " 자동차가 운전 중입니다.");
    }
}

package java.oop.composition;

public class Main {
    public static void main(String[] args) {
        CPU myCPU = new CPU("Intel i7");
        RAM myRAM = new RAM(16);

        Computer myComputer = new Computer(myCPU, myRAM);
        myComputer.boot();
    }
}

package composition;

public class Computer {
    CPU cpu;
    RAM ram;

    public Computer(CPU cpu, RAM ram){
        this.cpu = cpu;
        this.ram = ram;
    }

    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
        cpu.process();
        ram.load();
    }
}

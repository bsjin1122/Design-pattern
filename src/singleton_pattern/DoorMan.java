package singleton_pattern;

public class DoorMan {
    // 자바에서 static은 main 메서드를 호출하기 전에 JVM이 읽어서 메모리에 올라오는 친구
    private static DoorMan doorMan = new DoorMan();
    public static DoorMan getInstance(){ // static(x): heap이 관리하는 메서드(인스턴스메서드)
        return doorMan;
    }

    private DoorMan() {
    }

    public void 쫓아내(Animal a){
        System.out.println(a.getName()+ " 쫓아내");
    }
}

package proxy_pattern;

public class DoorManProxy extends DoorMan{
    // 컴퍼지션
    // extends 안할 경우
    private DoorMan doorMan;
    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫓아내(Animal a){
        System.out.println("안녕");
        doorMan.쫓아내(a);
    }

}

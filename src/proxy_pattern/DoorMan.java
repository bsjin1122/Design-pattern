package proxy_pattern;

public class DoorMan {
    // 하나의 일을 더 하고 싶다면? ex) 인사
    // 개방 폐쇄의 원칙(OCP): 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계
    public void 쫓아내(Animal a){
        System.out.println(a.getName()+ " 쫓아내");
    }
}

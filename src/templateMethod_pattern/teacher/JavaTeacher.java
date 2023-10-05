package templateMethod_pattern.teacher;

public class JavaTeacher extends Teacher{
    // 재정의
    void 강의하기(){ //동적 바인딩(C#: 동적결합)
        System.out.println("Java 강의하기");
    }

}

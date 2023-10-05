package templateMethod_pattern;

import templateMethod_pattern.teacher.JavaTeacher;
import templateMethod_pattern.teacher.PythonTeacher;
import templateMethod_pattern.teacher.Teacher;

public class Main {
    public static void start(Teacher t){
        t.수업시작();
    }
    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        t1.수업시작();
        System.out.println("-----------------");
        Teacher t2 = new JavaTeacher();
        t2.수업시작();
        System.out.println("-----------------");
        PythonTeacher t3 = new PythonTeacher();
        t3.수업시작();
        System.out.println("------------------");

        start(t3);
    }
}

package java.solid;

/* 02 - 개방-폐쇄의 원칙(OCP)
 * 기존의 코드는 수정할 필요가 없으므로 개방-폐쇄 원칙을 준수한 디자인이다.
 * 새로운 요구사항이나 기능을 추가할 때 기존의 코드를 변경하지 않고 확장 가능한 구조를 갖추는 것이 중요하다.
 */

// 추상클래스
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape { // Shape만 상속하고, calculateArea 메서드 구현만 하면 된다.
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape { // Shape만 상속하고, calculateArea 메서드 구현만 하면 된다.
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class OpenClosedPrinciple_02_OCP {
    public static void main(String[] args) {

    }
}

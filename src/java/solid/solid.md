출처: chatgpt

## SOLID 원칙 - 객체지향 설계의 다섯 가지 기본 원칙
이를 준수하면 소프트웨어 유지 보수성과 확장성이 향상된다. 

## 1원칙: 단일 책임의 원칙 

> ### Single Responsibility Principle, SRP
> 하나의 클래스는 하나의 변경 이유만 가져야 한다. 

```java
/* 위배된 코드*/
class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    public void generateInvoice() {
        // 고객에게 청구서를 생성하고 전송하는 로직
    }
}
```

이 코드에서 Customer 클래스는 고객 정보 관리(name과 balance 필드)와 
고객에게 청구서를 생성하고 전송하는 역할 두 가지를 동시에 수행하고 있다. 

---
## 2원칙 - 개방-폐쇄 원칙

> ### Open-Closed Principle, OCP
> 소프트웨어 엔티티(클래스, 모듈, 함수 등) 확장에는 개방적이어야 하고, 수정에는 폐쇄적이어야 한다는 원칙
> 기존의 코드를 수정하지 않고 새로운 기능을 추가할 수 있도록 하는 설계를 의미

```java
/* 위반한 코드*/
class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```
이 코드에서 새로운 도형을 추가하려면 새로운 클래스를 만들고, calculateArea 메서드를 구현해야 한다. 
이것은 수정에는 폐쇄적이지만, 확장에는 개방적이지 않다. 

---
## 3원칙 - 리스코프 치환 원칙
> ### Liskov Substitution Principle, LSP
> 하위 클래스(subclass)는 상위 클래스(superclass)의 기능을 변경하지 않고 확장할 수 있어야 한다는 원칙
> - 상속 관계를 갖는 클래스 간의 상호교체 가능성을 강조한다. 

```java
/* 위반한 코드 */
class Bird {
    void fly() {
        // 모든 새가 비행할 수 있는 것으로 가정
    }
}

class Penguin extends Bird {
    // 펭귄은 비행할 수 없으므로 fly 메서드를 오버라이드하지 않음
}

class Sparrow extends Bird {
    @Override
    void fly() {
        // 참새의 비행 로직
    }
}

```
펭귄 클래스는 Bird 클래스를 상속하지만, fly 메서드를 오버라이드 하지않으므로 
부모 클래스와 하위 클래스 사이에 동작이 일관되지 않는다. 

---
## 4원칙 - 인터페이스 분리 원칙
> ### Interface Segregation Principle, ISP
> 클라이언트가 자신이 사용하지 않는 메서드에 의존하지 않아야 한다는 원칙
> - 클라이언트는 필요한 메서드만 사용할 수 있어야 한다.

```java
/* 위반한 코드 */
interface Worker {
    void work();
    void eat();
}

class SuperWorker implements Worker {
    @Override
    public void work() {
        // 작업 로직
    }

    @Override
    public void eat() {
        // 식사 로직
    }
}
```
eat 메서드를 구현해야 하는데, 이 메서드는 SuperWorker가 필요로 하지 않는 기능일 수 있다. 
클라이언트가 자신이 사용하지 않는 메서드에 의존해야 하므로 문제가 발생할 수 있다.

---
## 5원칙 - 의존성 역전 원칙
> ### Dependency Inversion Principle, DIP
> 고수준 모듈은 저수준 모듈에 의존해서는 안 되며, 모든 모듈은 추상화에 의존해야 한다는 원칙을 나타낸다. 
> - 상위 수준의 모듈은 하위 수준의 모듈에 의존하면 안 되고, 모든 모듈은 공통된 인터페이스나 추상 클래스에 의존해야 한다. 

```java
/* 위반한 코드 */
class Switch {
    public void turnOn() {
        // 스위치를 켜는 로직
    }

    public void turnOff() {
        // 스위치를 끄는 로직
    }
}

class LightBulb {
    private Switch switchButton = new Switch();

    public void turnOn() {
        switchButton.turnOn();
    }

    public void turnOff() {
        switchButton.turnOff();
    }
}

```
LightBulb 클래스가 Switch 클래스에 직접 의존하므로, DIP를 위반하고 있다.
- 즉, 고수준 모듈(LightBulb)이 저수준 모듈(Switch)에 의존하고 있다.
- 
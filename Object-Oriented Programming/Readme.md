# 객체지향프로그래밍(Java)

## 24.4.29

### 9주차 Inheritance
- Inheritance 상속 개념을 학습하였다.
- Superclass에 있는 모든 public/protected attribute, method 들을 상속 받을 수 있다. 이는 같은 특징을 지닌 class들이 같은 attribute나 method를 따로 선언하지 않고 공유해서 사용할 수 있게하는 간편한 기능이다.
- Syntax
  ``` java
  DerivedClass extends BaseClass
  ```
- 만약 Superclass의 private variable에 접근하고 싶으면 superclass의 private variable public mutator나 accessor method를 사용해야함
- type casting은 subclass에서 superclass로 cast할 순 있지만 반대는 안됨
  + Superclass Person, Subclass Student라고 하면
  ```java
  Person p1 = new Person();
  /*
  Student s1 = (Student)p1; // Wrong
  */
  Person p2 = new Student(); // OK
  
  Student s2 = (Student)p2; // OK
  ```
- instanceof operator
  ```java
  return SomeClass instanceof Person;
  ```
- 이렇게 작성하면 SomeClass가 Person의 object인지 확인하는 거임        
  Person의 subclass의 object는 Person의 object 처럼 사용가능

### 24.5.1 Polymorphism
- subclass를 만들고 superclass의 method를 override하고, superclass object에 subclass object를 대입하고 method를 invoke하면 subclass가 override한대로 method가 실행됨
- Example: superclass가 Person, subclass가 각각 Student, Undergraduate, override한 method는 writeOutput()이면,
  ```java
  Person[] people = new Person[2];
  people[0] = new Student(~~);
  people[1] = new Undergraduate(~~);

  for (Person p : people) {
    p.writeOutput();
  }
  ```
  각 subclass에서 override한 method대로 실행됨!!

## 24.5.8

### 10주차 Interface
- abstract class와 interface 개념을 배웠다.
- abstract class는 abstract method를 하나 이상 가지고 있는 class를 말한다.
- interface는 method signature와 static final (constant)를 가짐. 즉, method body는 가지지 않음

표현
- abstract
  ```java
  public abstract class Shape {
    int width, height;

    public abstract double getArea();
  }
  ```
- interface
  ```java
  public interface Measurable {
    public static final int WHAT_THE = 100;
    public void measure();
  }
  ```
- abstract를 상속 받을 땐 사용법이 똑같음
- interface를 implements 할 땐
  ```java
  public class Measured implements Measurable {...}
  ```
  + 대신 interface가 상속 받은 method를 포함해서 모든 method를 implement 해줘야함!!


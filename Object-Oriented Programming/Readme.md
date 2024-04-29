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

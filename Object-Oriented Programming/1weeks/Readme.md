# 1주차
Scanner class를 통해 keyboard로 입력 값을 받는 방법을 배웠다.
사용법은 다음과 같다.
1. 코드 시작 부분에다음과 같이 쓴다
```java
import java.util.Scanner;
```
2. object 생성
```java
Scanner keyboard = new Scanner(System.in);
```
3. Scanner method로 원하는 값을 입력 받음 ex) integer
```java
int number = keyboard.nextInt();
```

- Ex1_2a
  
  + 출생연도를 적으면 현재를 기준으로 나이를 출력해주는 program이다.
- Ex1_2b
  + 두 정수값을 입력 받으면 그 정수값을 포함해 사이에 몇개의 정수가 있는지 출력하는 program이다.

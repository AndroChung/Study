# Chapter3 데이터 처리

## 03.1 간단한 변수

### 변수 이름

- 변수 이름 규칙

### 정수형

### short, int, long, long long 정수형

- 각 정수형 크기
- climits 헤더

### unsigned 형

- overflow

### 어느 정수형을 사용할 것인가?

- 컴퓨터 기본형 int
- 크기에 따라 사용

### 정수형 상수

- 10진수, 8진수 16진수 표현법
- cout의 정수 표현 변경법

### C++가 상수의 데이터형을 결정하는 방법

- 컴퓨터의 정수형 기본 처리
- 다양한 접미어

### char형: 문자와 작은 정수

- 아스키 코드
- 이스케이프 시퀀스 코드
- 확장 char형: wchar_t(1바이트로 표현 불가능한 문자 세트)

### bool 형

## 03.2 const 제한자

- C++의 define

## 03.3 부동 소수점수

### 부동 소수점수의 표기

- 기본 표현 방법
  - 12.34
  - 939001.32
- e,E 사용
  - 2.52e+8
  - 8.33E-4

### 부동 소수점형

- float, double, long double
- 각 크기
- cout.setf 함수로 소수점 개수 고정
- 유효 숫자 개수

### 부동 소수점형 상수

- 컴퓨터의 기본 부동 소수점형
- 접미어

### 부동 소수점수의 장단점

- 정수와 정수 사이 값 나타낼 수 있음
- 스케일을 사용하여 매우 큰 범위의 값을 나타낼 수 있음

## 03.4 C++ 산술 연산자

- +, -, *, /, %
- 우선순위, 결합 방향

### 나눗셈에 대한 보충

- 나눗셈에 의한 타입 변환

### 나머지셈 연산자

- 정수형끼리만 가능

### 데이터형 변환

- 자동 데이터형 변환
- 값 손실
- {} 초기화
- (type) value, type (value), static_cast<typename> (value)

### C++11에서의 auto 선언
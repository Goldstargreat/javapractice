# ☕ Java 연습 저장소

자바 문법과 객체지향 개념을 **챕터별로 직접 따라 치고 실행해 보며** 익히는 연습 공간입니다.
예제는 `chXX.secXX.examXX` 패키지 구조로 정리합니다.

## 📁 폴더 구조

```
src/
└── chXX/                  # 챕터
    └── secXX/             # 절(섹션)
        └── examXX/        # 예제
            ├── ...java
            └── ...Example.java   # main 메서드가 있는 실행 클래스
```

## 📚 학습 기록

| 챕터 | 섹션 | 주제 | 예제 |
|------|------|------|------|
| ch07 상속 | sec03 | 부모 생성자 호출 (`super`) | exam01, exam02 |

> 새로운 예제를 추가할 때마다 이 표에 한 줄씩 추가합니다.

---

## ch07 상속

### sec03 - 부모 생성자 호출 (super)

자식 객체를 생성할 때 **부모 생성자가 먼저 호출되는 원리**와
`super()` / `super(매개값)`의 사용법을 익히는 예제입니다.

#### 📌 핵심 개념

- 자식 객체를 만들면 **부모 객체가 먼저 생성**되고, 그 다음 자식 객체가 생성됩니다.
- 부모 생성자는 자식 생성자의 **맨 첫 줄**에서 `super(...)`로 호출합니다.
- `super()`를 생략하면 컴파일러가 자동으로 `super();`(부모의 기본 생성자 호출)를 넣어 줍니다.
- 부모에 **기본 생성자가 없고** 매개변수 생성자만 있으면, 자식 생성자에서 반드시
  `super(매개값, ...)`을 직접 써야 합니다. 쓰지 않으면 컴파일 에러가 발생합니다.

#### exam01 - 부모의 기본 생성자 호출

| 파일 | 역할 |
|------|------|
| `Phone.java` | 부모 클래스. 필드 `model`, `color`와 기본 생성자 `Phone()` |
| `SmartPhone.java` | 자식 클래스. `super();` 호출 후 상속받은 필드에 값 대입 |
| `SmartPhoneExample.java` | 실행 클래스. `SmartPhone` 객체 생성 후 필드 출력 |

```java
public SmartPhone(String model, String color) {
    super();              // 부모 기본 생성자 호출 (생략 가능)
    this.model = model;
    this.color = color;
    System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
}
```

실행 결과
```
Phone() 생성자 실행
SmartPhone(String model, String color) 생성자 실행됨
모델: 갤럭시
색상: 은색
```

#### exam02 - 부모의 매개변수 생성자 호출

| 파일 | 역할 |
|------|------|
| `Phone.java` | 부모 클래스. 기본 생성자 없이 `Phone(String model, String color)`만 선언 |
| `SmartPhone.java` | 자식 클래스. `super(model, color);`로 부모 생성자에 값 전달 |
| `SmartPhoneExample.java` | 실행 클래스. `SmartPhone` 객체 생성 후 필드 출력 |

```java
public SmartPhone(String model, String color) {
    super(model, color);  // 부모 매개변수 생성자 호출 (생략 불가)
    System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
}
```

실행 결과
```
Phone(String model, String color) 생성자 실행
SmartPhone(String model, String color) 생성자 실행됨
모델: 갤럭시
색상: 은색
```

> ⚠️ 현재 `exam02/SmartPhoneExample.java` 10번째 줄이 `myPhone.model`로 되어 있어
> **색상이 `갤럭시`로 출력**됩니다. `myPhone.color`로 고치면 `은색`이 출력됩니다.

#### 🔍 exam01 vs exam02

| 구분 | exam01 | exam02 |
|------|--------|--------|
| 부모 생성자 | 기본 생성자 `Phone()` | 매개변수 생성자 `Phone(model, color)` |
| 자식에서 호출 | `super();` | `super(model, color);` |
| `super` 생략 가능 여부 | 가능 (컴파일러가 자동 추가) | 불가능 (컴파일 에러) |
| 필드 초기화 위치 | 자식 생성자 | 부모 생성자 |

---

## ▶️ 실행 방법

**IDE (이클립스 / 인텔리제이)**
실행하려는 `...Example.java` 파일을 열고 Run 합니다.

**터미널**
```bash
# src 폴더에서
javac chXX/secXX/examXX/*.java
java chXX.secXX.examXX.클래스이름

# 예시
javac ch07/sec03/exam01/*.java
java ch07.sec03.exam01.SmartPhoneExample
```

## 🛠 개발 환경

- Language: Java
- IDE: IntelliJ IDEA
- JDK: 17

# 목차
## 1. 리팩터링 소개 (5분)
- 리팩터링이 중요한 이유
- 리팩터링에 대한 일반적인 오해와 진실

## 2. 리팩터링의 기본 개념 (15분)
- 리팩터링의 정의
- 리팩터링의 목적과 이점
- 리팩터링의 기본 원칙 (코드의 가독성, 유지보수성 향상)
- 리팩터링이 테스트와 품질에 미치는 영향
  - 작은 단계의 변화를 통해 큰 개선을 이루는 방법
  - 리팩터링을 시작하기 전 테스트 코드의 중요성
  - 리팩터링이 실패할 수 있는 사례 및 해결 방법

## 3. 리팩터링의 주요 기법 소개 (40분)

### 리팩터링 첫걸음
- **Replace Loop with Pipeline**: 반복문을 파이프라인으로 대체
- **Split Variable**: 변수 분리
- **Replace Magic Literal**: 매직 리터럴을 상수로 대체

### 기본적인 리팩터링
- **Extract Method**: 중복 코드의 분리 및 함수로 추출
  - **Split Phase**: 단계 쪼개기
- **Inline Method**: 함수 호출을 함수 본문으로 대체
- **Extract Variable**: 복잡한 표현식을 변수로 추출
- **Inline Variable**: 불필요한 변수의 제거
  - **Replace Temp with Query**: 임시 변수를 질의 메소드로 대체
- **Rename Method/Variable**: 가독성을 높이기 위한 명확한 명명
  - **Change Function Declaration**: 함수 선언 변경
- **Introduce Parameter Object**: 여러 개의 매개변수를 객체로 추출
- **Combine Functions into Class**: 여러 함수를 클래스로 묶기
  - **Combine Functions into Transform**: 여러 함수를 변환 함수로 묶기

### 캡슐화
- **Encapsulate Record**: 레코드 캡슐화
- **Encapsulate Collection**: 컬렉션 캡슐화
- **Replace Primitive with Object**: 기본 타입을 객체로 대체

### 조건부 로직 간소화
- **Decompose Conditional**: 조건문을 보기 좋게 함수로 분리
- **Replace Conditional with Polymorphism**: 조건부 로직을 다형성으로 대체
- **Introduce Assertion**: 가정문을 추가하여 코드의 가독성 향상

### API 리팩터링
- **Separate Query from Modifieer**: 질의 함수와 변경 함수 분리
- **Parameterize Function**: 함수를 매개변수화
- **Remove Flag Argument**: 플래그 인수 제거
- **Replace Parameter with Query**: 매개변수를 질의 함수로 대체
- **Replace Error Code with Exception**: 에러 코드를 예외로 대체

### 상속 다루기
- **Pull Up Method**, **Pull Down Method**, **Pull Up Field**, **Pull Down Field**
  - 상속 관계에서 메소드와 필드를 상위 클래스로 끌어올리거나 내리기
  - 생성자 공통화 (**Pull Up Constructor Body**)
- **Replace Type Code with Subclasses**: 타입 코드를 하위 클래스로 대체
- **Replace Subclass with Delegate**, **Replace Superclass with Delegate**
  - Strategy 패턴

## 4. IntelliJ IDEA의 리팩터링 도구 소개 및 활용 (20분)
- IntelliJ에서 제공하는 리팩터링 기능 소개
- 주요 리팩터링 도구 데모 (Extract Method, Inline Method 등)
- 단축키 및 효율적인 사용 팁
- 간단한 예제 코드 제공 및 실습
- 실습을 통해 주요 리팩터링 기법 직접 적용
- 실습 후 간단한 피드백 및 Q&A

## 5. 마무리 및 Q&A (10분)
- 리팩터링이 지속적으로 필요한 이유
- 앞으로 리팩터링을 학습하고 적용할 수 있는 방법 제시
  - [Refactoring Catalog](https://refactoring.com/catalog/)
  - [마틴 파울러의 리팩터링 (번역본 2판)](https://product.kyobobook.co.kr/detail/S000001810241)
    - [개인 블로그 (리팩터링 책 요약)](https://velog.io/@rolroralra/series/refactoring)
  - [헤드퍼스트 디자인 패턴](https://product.kyobobook.co.kr/detail/S000001810483)
- 강의 내용 정리 및 질문 응답
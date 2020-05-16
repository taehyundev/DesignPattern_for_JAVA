## 템플릿 메소드 패턴

* What is template - 모양틀같은 개념



* What is Template Method Pattern
  * 구현하려는 알고리즘이 일정한 프로세스가 있다. (여러단계로 나눌 수 있다.)
  * 구현하려는 알고리즘이 변경 가능성이 있다.



* How use Template Method Pattern?
  * 알고리즘을 여러단계로 나눈다.
  * 나눠진 알고리즘의 단계를 메소드로 선언한다.
  * 알고리즘을 수행할 템플릿 메소드를 만든다.
  * 하위 클래스에서 나눠진 메소드들을 구현한다.
# 1챕터

## 객체지항 설계란 ?
- 객체간의 상호 의존을 통해 주어진 문제를 해결하고 협력하는 것


## 응집도는 올리고 결합도는 낮추어라
- 하나의 객체가 여러가지 책임을 가질 이유는 없다 각 객체만의 책임과 역할을 부여할 것
- 응집도가 올라가면 수정에 용이하지만 결합도가 높으면 수정하기가 까다로워짐

## 타 객체가 무슨 일을 하는지 알 필요는 없다.
- ex) 매표소 직원은 손님이 초대를 받았는지 초대를 받지않았는지 알 필요가 없음 그저 확인후 입장만을 도와주면 됌
- ex) 가방은 그저 티켓을 가지고있다면 관객이 티켓을 꺼낼때 티켓을 리턴하기만 하면됌 어떤식으로 리턴하는지는 타 객체가 알 필요가 없음, 가방은 오로지 티켓 보관과 반환 기능만을 수행함(각자만의 책임과 역할)

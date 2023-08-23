# 1장 오브젝트

## 한줄 요약
- 훌륭한 설계는 적절한 트레이드 오프의 결과물

## 정의

- 객체지향설계 :  모든 객체를 자율적으로 행동하는 설계


## 객체지향적 설계
- 객체를 자율적으로 바꾸기, 의인화
- 변경을 수용할 수 있는 설계 => 요구사항 변경 가능성을 고려
- 이해하기 쉬운 코드
- 변경하기 쉬운 설계는 한번에 하나의 클래스만 변경할 수 있는 설계


## 지양해야할 부분
- 객체간의 의존성을 가지는 것은 애플리케이션 수정하기에 어려움


## 토론 주제

<details>
    <summary>결합도를 낮추는 방법은 무엇인가? </summary>
    <ul>
        <li>결합도가 높은 코드는 비슷한 기능을 하는 클래스들이 따로 분리된 것 </li>
        <li>인터페이스를 활용하면 Tv 클래스 변수로 손쉽게 교체가 가능함</li>
        <li>Factory 디자인 패턴을 활용하면 됨 BeanFactory, 느슨한 결합 상태</li>
        <li>스프링 IoC 컨테이너 </li>
    </ul>

```java
public class BeanFactory{
	// 기본 생성자
	public Object getBean(String beanName){
		if(beanName.equals("samsung")){
			return new SamsungTV();
		} else {
			return new LgTV();
		}
		return null;
	}
}

public class TVuserFactory{
	public static void main(String[] args){
		System.out.println(args[0]);
		
		BeanFactory factory = new BeanFactory();
		Tv tv = (TV) factory.getBean(args[0]);
		tv.powerOn(); 
		///...
	}
}
```

### +
<article>

- <a href="https://heidi-mood.com/entry/%EA%B2%B0%ED%95%A9%EB%8F%84-Coupling-%EA%B2%B0%ED%95%A9%EB%8F%84-%EB%82%AE%EC%B6%94%EA%B8%B0-%EB%8B%A4%ED%98%95%EC%84%B1-%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4Factory">결합도 낮추는 방법</a>
- <a href="https://dev-coco.tistory.com/80">스프링 IOC 컨테이너</a>
- DI 수정자 주입(Setter), 생성자 주입(Constructor) 필드 주입 (Method)
- @Component, @Bean 스프링 빈을 등록하는 방법
- 스프링 컨테이너가 관리하는 객체를 빈
- 이 빈들을 관리한다는 의미로 컨테이너를 빈 팩토리라고 부름
- BeanFactory < ApplicationContext
- 국제화가 지원되는 텍스트 메시지를 관리
- 이미지같은 파일 자원을 로드할 수 있는 포괄적인 방법 제공
- 리스너로 등록된 빈에게 이벤트 발생을 알려줌

</article>

</details>


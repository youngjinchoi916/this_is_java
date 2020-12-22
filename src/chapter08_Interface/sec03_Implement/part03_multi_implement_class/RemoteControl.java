package chapter08_Interface.sec03_Implement.part03_multi_implement_class;

/*
 * [Interface]
 * 	 - 자바에서 인터페이스는 객체의 사용 방법을 정의한 타입이다.
 *     인터페이스는 객체의 교환성을 높여주기 때문에 다형성을 구현하는 매우 중요한 역할을 한다.
 *  - 인터페이스는 개발코드와 객체가 서로 통신하는 접점 역할을 한다.
 *     개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출시킨다.
 *     그렇기 때문에 개발 코드는 내부 구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 된다.
 *  - 왜 인터페이스를 사용할까?
 *   		-> 개발코드를 수정하지 않고, 사용하는 객체를 변경할 수 있도록 하기 위해서이다.
 *   			인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라서 실행내용과 리턴값이 다를 수 있다.
 *     			따라서, 개발 코드 측면에서는 변경 없이 실행 내용과 리턴값을 다양화할 수 있다는 장점을 가지게 된다
 *  - 클래스는 필드, 생성자, 메소드를 구성 멤버로 가지는데 비해, 인터페이스는 상수와 메소드만을 구성멤버로 가진다.
 */
public interface RemoteControl {
	
	/* 상수필드 */
	//인터페이스는 객체 사용 설명서 이므로 런타임 시 데이터를 저장할 수 있는 필드를 선언할 수 없지만, 상수 필드(static final)은 선언 가능하다.
	//상수는 인터페이스에 고정된 값으로 런타임 시에 데이터를 바꿀 수 없다. 상수를 선언할 때는 반드시 초기값을 대입해야 한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/* 추상메소드 */
	//추상메소드는 객체가 가지고 있는 메소드를 설명한 것으로 호출할 때 어떤 매개값이 필요하고, 리턴타입이 무엇인지만 알려준다.
	//실제 실행부는 객체(구현 객체)가 가지고 있다.
	//인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행된다. 그렇기 때문에 인터페이스의 메소드는 실행블록이 필요없는 추상 메소드로 선언한다.
	//추상메소드는 자동으로 public abstract의 특성을 갖기 때문에 생략해도 된다.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/* 디폴트 메소드 : 자바8에서 추가된 인터페이스의 새로운 멤버 */
	//default 키워드가 리턴 타입 앞에 붙는다. 디폴트 메소드는 public 특성을 갖기 때문에 public을 생략하더라도 자동적으로 컴파일 과정에서 붙게 된다.
	
	//[디폴트 메소드를 사용하는 이유]
	//인터페이스를 사용 중인데 newMethod() 를 추가한다면 인터페이스를 구현한 모든 객체에 newMethod()를 재정의 해야한다.(재정의 안하면 오류)
	//디폴트 메소드는 모든 구현 객체에 재정의해야한다는 문제를 해결해줌.                                      
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	/* 정적 메소드 : 자바8에서 추가된 인터페이스의 새로운 멤버 */
	//형태는 클래스의 정적메소드와 완전 동일하다. 정적 메소드는 public 특성을 갖기 때문에 생략하더라도 자동적으로 컴파일과정에서 붙게 된다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
} //end interface

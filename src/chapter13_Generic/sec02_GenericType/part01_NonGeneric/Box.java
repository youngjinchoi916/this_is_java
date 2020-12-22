package chapter13_Generic.sec02_GenericType.part01_NonGeneric;

public class Box {

	//Object 타입을 사용하면 모든 종휴의 자바 객체를 저장할 수 있다는 장점은 있지만,
	//저장할 때 Object 타입으로 자동타입변환이 발생하고, 읽어올 때에도 강제타입변환이 발생한다.
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}

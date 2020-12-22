package chapter08_Interface.sec07_Default_Method_Expansion.part01_Necessity;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	//디폴트 메소드의 재정의
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
}

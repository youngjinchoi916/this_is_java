package chapter06_Class.sec08_Method.part03_MethodCall.inner;

public class CalculatorExample {

	//객체 내부 메소드 호출
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		/* 메소드 호출 순서 */
		// execute() -> avg() -> plus() -> println()
		myCalc.execute();
	}

}
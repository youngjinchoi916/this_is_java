package chapter06_Class.sec08_Method.part01_Declaration;

public class Calculator {
	
	/* 메소드 선언 방법*/
	//접근제한자 리턴타입 메소드이름(매개변수...) { ... 실행부 ...}
	
	/* 메소드 명명 규칙 */
	// 1. 숫자로 시작할 수 없고, $,_를 제외한 특수문자는 사용불가능
	// 2. 관례적으로 메소드명은 소문자로 시작
	// 3. 관례적으로 카멜 표기법을 따른다.
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	/* 매개변수 선언 */
	// 매개변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용된다.
	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	/* 매개변수의 수를 모를 경우 */
	// 메소드의 매개 변수는 개수가 이미 정해져 있는 것이 일반적이지만, 경우에 따라서는 메소드를 선언할 때 매개 변수의 개수를 알 수 없는 경우도 있다.
	// 해결책 -> 매개 변수를 배열 타입으로 선언한다.
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//배열을 생성하지 않고 값의 리스트만 넘겨주는 방법
	public int sum2(int ... values) {
		int sum = 0;		
		for(int a : values) {
			sum += a;
		}
		return sum;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}

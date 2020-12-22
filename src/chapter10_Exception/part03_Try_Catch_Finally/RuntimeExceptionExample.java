package chapter10_Exception.part03_Try_Catch_Finally;

public class RuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		/*
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample  num1  num2");
			return;
		} 
		*/
		
		//실행예외는 컴파일러가 체크하지 않기 때문에 개발자의 경험에 의해 예외 처리를 작성해주어야 한다.
		try { 
			int value1 = Integer.parseInt(data1);
			System.out.println("data1 변환 완료");
			
			int value2 = Integer.parseInt(data2);
			System.out.println("data2 변환 완료");
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}


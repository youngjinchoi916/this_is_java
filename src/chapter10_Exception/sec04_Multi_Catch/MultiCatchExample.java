package chapter10_Exception.sec04_Multi_Catch;

public class MultiCatchExample {
	public static void main(String[] args) {
		//자바 7 부터 하나의 catch 블록에서 여러 개의 예외를 처리할 수 있도록 멀티 catch 기능을 추가했다.
		//catch 블록 괄호 안에 | 로 예외를 연결하면 된다.
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("알수 없은 예외 발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		
	} //end main
	
} //end class
package chapter10_Exception.sec02_Runtime_Exception;

public class NumberFormatException {

	/*
	 * [NumberFormatException]
	 *   - 문자열로 되어 있는 데이터를 숫자로 변경하는 경우가 자주 발생한다.
	 *   - Wrapper 클래스의 정적 메소드인 parseXXX() 사용 시 문자열을 숫자로 변환할 수 없는 문자가 포함되어 있다면 NumberFormatException 발생
	 */
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
				
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	//문자열을 숫자로 변환 할 수 없음.
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	} //end main

} //end class
package chapter10_Exception.part02_Runtime_Exception;

//실행 예외는 자바 컴파일러가 체크를 하지 않기 때문에 오로지 개발자의 경험에 의해서 예외 처리 코드를 삽입해야 한다.
public class NullPointerException {
	/*
	 * [NullPointerException]
	 *   - 객체 참조가 없는 상태, 즉 null값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생한다.
	 *   - 객체가 없는 상태에서 객체를 사용하려 했으니 예외가 발생한다.
	 */
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}


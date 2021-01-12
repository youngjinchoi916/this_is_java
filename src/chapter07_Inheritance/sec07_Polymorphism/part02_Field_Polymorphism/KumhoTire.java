package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class KumhoTire extends Tire {
	//필드 -> 부모의 필드 사용
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		//super() 로 부모 생성자 호출
		super(location, maxRotation);
	}	
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	} //end roll()
	
} //end class

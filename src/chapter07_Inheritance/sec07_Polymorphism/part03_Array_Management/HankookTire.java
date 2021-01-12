package chapter07_Inheritance.sec07_Polymorphism.part03_Array_Management;

public class HankookTire extends Tire {
	//필드 -> 부모의 필드 사용
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		//super() 로 부모 생성자 호출
		super(location, maxRotation);
	}	
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	} //end roll()
	
} //end class

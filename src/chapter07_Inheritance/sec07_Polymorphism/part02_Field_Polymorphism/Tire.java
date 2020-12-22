package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class Tire {
	//필드
	public int maxRotation;     				//최대회전수(타이어 수명)
	public int accumulatedRotation;		//누적회전수
	public String location;       				//타이어의 위치

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//메소드
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	} //end roll()
	
} //end class


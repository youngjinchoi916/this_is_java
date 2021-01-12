package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class Tire {
	//필드
	public int maxRotation;     				//최대회전수(타이어 수명)
	public int accumulatedRotation;		//누적회전수
	public String location;       				//타이어의 위치

	//생성자
	public Tire() {}
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	//메소드 -> 타이어를 한바퀴 굴리고, 수명이 남아 있는지 없는지를 리턴
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;	//타이어의 수명이 남아 있음
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;	//타이어의 수명이 남아 있지 않음.
		}
	} //end roll()
	
} //end class


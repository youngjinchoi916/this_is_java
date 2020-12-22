package chapter07_Inheritance.sec07_Polymorphism.part03_Array_Management;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		/* 왼쪽 바퀴는 한국타이어-15, 오른쪽 바퀴는 금호타이어-15로 교체 */
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();  //run 리턴값 : 0(정상), 1(펑크), 2(펑크), 3(펑크), 4(펑크)
			if(problemLocation != 0) { //펑크나면
				if(problemLocation%2 == 1) {  //홀수면 한국 타이어
					System.out.println(car.tires[problemLocation-1].location+"HankookTire로 교체");
					car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
				} else { //짝수면 금호 타이어
					System.out.println(car.tires[problemLocation-1].location+"KumhoTire로 교체");
					car.tires[problemLocation-1] = new KumhoTire(car.tires[problemLocation-1].location, 15);
				}
				
			}			
			System.out.println("----------------------------------------");
		} //end for
		
	} //end main
} //end class

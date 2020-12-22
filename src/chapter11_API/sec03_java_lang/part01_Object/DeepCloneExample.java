package chapter11_API.sec03_java_lang.part01_Object;

import java.util.Arrays;

public class DeepCloneExample {

	/*
	 * [객체 복제]
	 *   - 객체 복제란 원본 객체의 필드값돠 동일한 값을 가지는 새로운 객체를 생성하는 것이다.
	 *   - 객체를 복제하는 이유는 우너본 객체를 안전하게 복제하기 위해서이다.
	 *     신뢰하지 않는 영역으로 원본 객체를 넘겨 작업할 경우 원본 객체의 데이터가 훼손될 수 있기 때문에 
	 *     복제된 객체를 만들어 신뢰하지 않는 영역으로 넘기는 것이 좋다.
	 *   - 객체 복제 방법
	 *   		(1) 얕은 복제(thin clone) : 단순히 필드값을 복사 해서 객체를 복제하는 것
	 *   		(2) 깊은 복제(deep clone) : 참조하고 있는 객체도 복제하는 것
	 */
	
	/*
	 * (2) 깊은 복제 : 참조하고 있는 객체도 복제하는 것.
	 *   - 얕은 복제의 경우, 필드가 참조 타입일 경우 객체의 번지가 복제 되기 때문에 같은 객체(필드)를 참조한다.
	 *      만약 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게 된다.(얕은 복제의 단점)
	 *   - 깊은 복제의 경우 참조하는 객체도 복제하기 때문에 복제 객체를 변경한다고 해서 원본 객체가 변경되지 않는다.
	 */
	
	public class Member implements Cloneable { //Cloneable -> 복제할 수 있다는 표시
		/*
		 * [Cloneable 인터페이스 구현]
		 *   - clone() 메소드로 객체를 복제하려면 원본 객체는 java.lang.Cloneable 인터페이스를 구현하고 있어야 한다.
		 *   - 메소드 선언이 없음에도(Cloneable 인터페이스에는 추상 메소드 선언이 없음) Cloneable 인터페이스를 명시하는 이유는
		 *      클래스 설계자가 복제를 허용한다는 의도적인 표시를 하기 위해서 이다.
		 *   - 클래스 설계자가 복제를 허용하지 않는다면 Cloneable 인터페이스를 구현하지 않으면 된다.
		 */
		public String name;
		public int age;
		/* 필드가 참조 타입일 경우 -> 깊은 복제(clone() 메소드 재정의) */
		public int[] scores;
		public Car car;
		
		public Member() {}
		public Member(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		/*
		 * [Object clone() 메소드]
		 *   - 깊은 복제를 하려면 Object의 clone() 메소드를 재정의해서 참조 객체를 복제하는 코드를 직접 작성 해야 한다.
		 */
		//cloned() 메소드 재정의
		@Override
		protected Object clone() throws CloneNotSupportedException {
			//(1) 얕은 복제(기본 타입 필드 -> name, age)
			Member cloned = (Member) super.clone();	//Object의 clone() 호출
			
			//(2) scores 깊은 복제
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			
			//(3) Car 깊은 복제
			cloned.car = new Car(this.car.model);
			
			return super.clone();
		}
		
		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone(); 	//위에서 재정의한 clone() 메소드 호출
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	}
	
	public static void main(String[] args) {
		DeepCloneExample ex = new DeepCloneExample();
		
		//원본 객체 생성
		Member original = ex.new Member("홍길동", 23, new int[] {90, 90}, new Car("소나타"));
		
		//복제 객체를 얻은 후 참조 객체의 값 변경
		Member cloned = original.getMember();
		/*
		 * 깊은 복제 후 복제본 변경은 원본에 영향을 미치지 않는다.
		 */
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : "+cloned.name);
		System.out.println("age : "+cloned.age);
		System.out.print("scores : {");
		for(int i=0 ; i<cloned.scores.length ; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print(i == (cloned.scores.length - 1) ? "" : ", ");
		}
		System.out.println("}");
		System.out.println("car : "+cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : "+original.name);
		System.out.println("age : "+original.age);
		System.out.print("scores : {");
		for(int i=0 ; i<original.scores.length ; i++) {
			System.out.print(original.scores[i]);
			System.out.print(i == (original.scores.length - 1) ? "" : ", ");
		}
		System.out.println("}");
		System.out.println("car : "+original.car.model);

	}

}

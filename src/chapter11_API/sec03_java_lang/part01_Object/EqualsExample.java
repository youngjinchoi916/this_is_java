package chapter11_API.sec03_java_lang.part01_Object;

public class EqualsExample {
	/*
	 * [Object 클래스]
	 *   - 자바에서 상속받지 않은 모든 클래스들은 java.lang.Objet 클래스를 암시적으로 상속받는다.
	 *   	즉, 자바의 모든 클래스는 Object 클래스의 자식이거나 자손클래스이다. Object는 자바의 최상위 부모 클래스에 해당한다.
	 */
	
	public class Member {
		public String id;
		
		public Member(String id) {
			this.id = id;
		}
		
		/*
		 * [equals() 메소드]
		 * 	 - public boolean equals(Object object) { ... } : 매개타입이 Object(최상위 타입)이므로 자바의 모든 객체가 대입될 수 있다.(자동타입변환)
		 * 	 - Object 클래스의 equals() 메소드는 비교연산자인 == 와 동일한 결과를 리턴한다.(동일객체면 true, 아니면 false)
		 * 		즉, 동일한 객체인지 아닌지 비교한다.(객체의 주소지 비교)
		 */
		
		//id가 같으면 같은 객체를 참조하도록 equals() 메소드 재정의
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member) obj;
				if(id.equals(member.id)) { //여기서 사용된 equals() 메소드는 Object의 equals() 메소드
					return true;
				}
			}
			return false;
		} 
		
		@Override
		public int hashCode() {
			//String의 hashCode()는 같은 문자열일 경우 동일한 해시코드를 리턴함
			return id.hashCode();
		}
	}//end Member class
	
	public static void main(String[] args) {
		EqualsExample ex = new EqualsExample();
		//[참고] new 연산자로 Member 객체를 생성했기 때문에 equals() 메소드가 재정의 되어있더라도 서로 다른 객체의 주소값이 저장되어 있다.
		Member obj1 = ex.new Member("blue");
		Member obj2 = ex.new Member("blue");
		
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		Member obj3 = ex.new Member("red");
		
		//equals() 메소드를 재정의 하지 않았다면 Object의 equals() 메소드를 호출 한다.
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같은 객체 참조");
		} else {
			System.out.println("다른 객체 참조");
		}
		
		if(obj2.equals(obj3)) {
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("obj2와 obj3는 다른 객체 참조");
		}
	} //end main

} //end class

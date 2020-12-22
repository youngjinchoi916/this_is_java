package chapter15_CollectionFramwork.sec02_List.part01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class my01_ArrayList {

	/*
	 * [List]
	 * 		- List 컬렉션은 객체를 일렬로 늘어놓은 구조를 가지고 있다.
	 *       객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
	 *     - List는 객체 자체를 저장하는 것이 아니라 객체의 번지를 참조한다.
	 *		  동일한 객체를 중복 저장할 수 있는데, 이 경우 동일한 번지가 참조된다. 
	 *		  null도 저장 가능한데 이 경우에 해당 인덱스는 객체를 참조하지 않는다.
	 */
	public static void main(String[] args) {
		/*
		 * [ArrayList] : 싱글스레드에서만 사용
		 * 	 - ArrayList는 List 인터페이스의 구현클래스로, ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다.
		 * 	 - 인덱스로 객체를 관리한다는 점이 배열과 유사하지만, 
		 * 			배열은 생성 시 크기가 고정되는 특징이 있고, 
		 * 			ArrayList는 10개의 객체를 저장할 수 있는 초기용량을 가지며, 저장용량을 초과한 객체들이 들어오면 자동적으로 저장용량이 늘어난다.
		 */
		//List<String> list = new ArrayList<String>(30);    //초기용량을 설정할 수 있다.
		List<String> list = new ArrayList<String>();

		/* boolean add(E e) : 주어진 객체의 맨 끝에 추가 */
		/* void add(int index, E e) : 주어진 인덱스에 객체 추가 */
		//ArrayList에 객체를 추가하면 인덱스 0부터 순서대로 저장된다.
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		/* int size() : 저장되어 있는 전체 객체 수를 리턴 */
		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		/* E get(int index) : 주어진 인덱스에 저장된 객체를 리턴 */
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		/* E remove(int index) : 주어진 인덱스에 저장된 객체를 삭제 */
		/* boolean remove(Object obj) : 주어진 객체를 삭제 */
		list.remove(2);	//2번 인덱스에 저장된 객체를 삭제하고, 3번 인덱스 이후의 객체 전부를 앞으로 한 칸씩 땡긴다.
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		/* void clear() : 저장된 모든 객체를 삭제 */
		/* boolean isEmpty() : 컬렉션이 비어있는지 조사 */
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list 객체는 비어있습니다.");
			list.add("호랑이");
			list.add("호랑이");
			list.add("사자");
			list.add("코끼리");
			list.add("라이언");
			list.add("기린");
		} else {
			for(String str : list) {
				System.out.println(str);
			}			
		}
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		/* E set(int index, E element) : 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈 */
		//원래있던 값을 리턴한다.
		list.set(1, "타이거");   //출력해보면 원래 있던 값인 "호랑이"가 리턴됨을 알 수 있다.
		
		/* boolean contains(Object obj) : 주어진 객체가 저장되어 있는지 여부 */
		if(list.contains("타이거")) {
			System.out.println("타이거가 저장되어 있습니다.");
		} else {
			System.out.println("타이거가 없습니다.");
		}
		
		if(list.contains("표범")) {
			System.out.println("표범이 저장되어 있습니다.");
		} else {
			System.out.println("표범이 없습니다.");
		}
	} //end main
	
} //end class

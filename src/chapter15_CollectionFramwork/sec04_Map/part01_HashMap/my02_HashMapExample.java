package chapter15_CollectionFramwork.sec04_Map.part01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class my02_HashMapExample {

	public static void main(String[] args) {
		Map<my02_Student, Integer> map = new HashMap<my02_Student, Integer>();

		/* my02_Student에 hashCode() 리턴값이 같고, equals() 가 true를 리턴하면 동일한 객체로 인식하도록 재정의하였음. */ 
		//키가 동일한 경우 : 키는 중복저장되지 않는다. 
		//만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체 된다.
		map.put(new my02_Student(1, "호랑이"), 95);
		map.put(new my02_Student(1, "호랑이"), 80);  //동일한 키가 있다면 value가 새로운 값으로 교체됨.
		map.put(new my02_Student(2, "사자"), 80);

		System.out.println("총 Entry 수: " + map.size());

		Set<Map.Entry<my02_Student, Integer>> entry = map.entrySet();
		Iterator<Map.Entry<my02_Student, Integer>> iterator = entry.iterator();
		
		System.out.println("학번\t이름\t\t점수");
		while(iterator.hasNext()) {
			Map.Entry<my02_Student, Integer> entryIterator = iterator.next();
			my02_Student student = entryIterator.getKey();
			int score = entryIterator.getValue();
			
			System.out.print(student.sno+"\t"+student.name+"\t\t"+score+"\n");
		} //end while
		
	} //end main

} //end class

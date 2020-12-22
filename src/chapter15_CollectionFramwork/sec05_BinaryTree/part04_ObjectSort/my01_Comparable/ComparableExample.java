
package chapter15_CollectionFramwork.sec05_BinaryTree.part04_ObjectSort.my01_Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	
	/*
	 *  - TreeSet 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순 정렬되는데, 
	 *     숫자 타입(Integer, Double)은 값으로 정렬하고, String 타입일 경우에는 유니코드로 정렬한다.
	 *  - TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable을 구현한 객체를 요구하는데, Integer, Double, String은 모두 Comparable 인터페이스를 구현하고 있다.
	 *  - 사용자 정의 클래스도 Comparable을 구현한다면 자동 정렬이 가능하다.
	 *     즉, TreeSet이나 TreeMap에 사용자 정의 클래스를 저장하고 싶다면, 사용자 정의 클래스가 Comparable 인터페이스를 구현하고, compareTo() 메소드를 재정의 해야 한다.
	 */
	public static void main(String[] args) {
		TreeSet<Person> treeSet1 = new TreeSet<Person>();
		treeSet1.add(new Person("호랑이", 35));
		treeSet1.add(new Person("사자", 31));
		treeSet1.add(new Person("기린", 31));
		treeSet1.add(new Person("코끼리", 25));
		
		Iterator<Person> iterator1 = treeSet1.iterator();
		while(iterator1.hasNext()) {
			Person person = iterator1.next();
			System.out.println(person.name+" : "+person.age);
		}
		System.out.println();
		
		/*
		 * TreeSet 객체와 TreeMap의 키가 Comparable을 구현하고 있지 않을 경우에는 저장하는 순간 ClassCastException 발생한다.
		 *    -> Comparable 비구현 객체를 정렬하는 방법은 TreeSet, TreeMap 생성자의 매개값으로 정렬자(Comparator)를 제공하면 Comparable 비구현 객체도 정렬시킬 수 있다.
		 */
		TreeSet<Student> treeSet2 = new TreeSet<Student>();
		
		//my01_Student는 Comparable 인터페이스를 구현하지 않아서 TreeSet에 저장할 수 없다.
		treeSet2.add(new Student("호랑이", 35));    //ClassCastException
		treeSet2.add(new Student("사자", 31));    //ClassCastException
		treeSet2.add(new Student("코끼리", 25));    //ClassCastException
		
		Iterator<Student> iterator2 = treeSet2.iterator();
		while(iterator2.hasNext()) {
			Student person = iterator2.next();
			System.out.println(person.name+" : "+person.age);
		}
		
	} //end main

}

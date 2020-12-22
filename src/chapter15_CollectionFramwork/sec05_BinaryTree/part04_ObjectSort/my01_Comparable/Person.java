package chapter15_CollectionFramwork.sec05_BinaryTree.part04_ObjectSort.my01_Comparable;

public class Person implements Comparable<Person>{

	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Comparable<T> 인터페이스를 구현했으면 compareTo() 메소드를 반드시 재정의 해야한다.
	//나이순으로 정렬
	@Override
	public int compareTo(Person o) {
		if(this.age < o.age) {  //주어진 객체보다 적으면 음수를 리턴
			return -1;
		} else if (this.age == o.age) {  //주어진 객체와 같으면 0을 리턴
			return 0;
		} else {  //주어진 객체보다 크면 양수를 리턴
			return 1;
		}
	}
}

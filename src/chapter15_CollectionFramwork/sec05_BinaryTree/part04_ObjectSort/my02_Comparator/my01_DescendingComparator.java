package chapter15_CollectionFramwork.sec05_BinaryTree.part04_ObjectSort.my02_Comparator;

import java.util.Comparator;

public class my01_DescendingComparator implements Comparator<my01_Fruits>{
	/*
	 * TreeSet 객체와 TreeMap의 키가 Comparable을 구현하고 있지 않을 경우에는 저장하는 순간 ClassCastException 발생한다.
	 *    -> Comparable 비구현 객체를 정렬하는 방법은 TreeSet, TreeMap 생성자의 매개값으로 정렬자(Comparator)를 제공하면 Comparable 비구현 객체도 정렬시킬 수 있다.
	 *    
	 *    int compare(T o1, T o2) 메소드
	 *    		- o1과 o2가 동등하다면 0을 리턴
	 *    		- o1이 o2 보다 앞에 오게하려면 -1(음수)을 리턴. o1 < o2 : -1
	 *    		- o1이 o2 보다 뒤에 오게하려면 1(양수)을 리턴. o2 < o1 : 1
	 */
	
	/* comapre()의 리턴값 */
	// -1 : o1 < o2 오름차순
	// 1 : o2 < o1 내림차순
	// 0 : 
	@Override
	public int compare(my01_Fruits o1, my01_Fruits o2) {
		if(o1.price > o2.price) {
			return -1;
		} else if (o1.price < o2.price) {
			return 1;
		} else {
			return 0;
		}
	}
}

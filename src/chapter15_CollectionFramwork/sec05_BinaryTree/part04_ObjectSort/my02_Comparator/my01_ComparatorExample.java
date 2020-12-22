package chapter15_CollectionFramwork.sec05_BinaryTree.part04_ObjectSort.my02_Comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class my01_ComparatorExample {

	public static void main(String[] args) {
		/*
		TreeSet<my01_Fruits> treeSet = new TreeSet<my01_Fruits>();
		//Fruit이 Comparable을 구현하지 않았기 때문에 ClassCastException 발생
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		//TreeSet 또는 TreeMap 생성자의 매개값으로 정렬자(Comparator)를 제공한다. -> Comparable 비구현 객체도 정렬 가능		
		TreeSet<my01_Fruits> treeSet = new TreeSet<my01_Fruits>(new my01_DescendingComparator());
		
		treeSet.add(new my01_Fruits("포도", 3000));
		treeSet.add(new my01_Fruits("수박", 10000));		
		treeSet.add(new my01_Fruits("딸기", 6000));
		
		Iterator<my01_Fruits> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			my01_Fruits fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
		

	} //end whlie

} //end class

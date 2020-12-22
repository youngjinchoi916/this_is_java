package chapter15_CollectionFramwork.sec05_BinaryTree.part04_ObjectSort.my02_Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class my02_Comparator {

	public static void main(String[] args) {
		
		//TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				/* String 문자열 비교 */
				//앞에 있는게 먼저 나온다.
				return o2.compareTo(o1);
			}
		});
		
		//TreeMap은 key 값을 기준으로 오름차순 정렬된다.(default)
		//그런데 Comparator를 제공받아더 compare() 메소드로 String을 역순으로 정렬하라 했으므로, 이름의 역순으로 저장된다.
		treeMap.put("기린", 33);
		treeMap.put("늑대", 23);
		treeMap.put("호랑이", 35);
		treeMap.put("표범", 11);
		treeMap.put("하마", 32);
		treeMap.put("코끼리", 38);
		treeMap.put("다람쥐", 18);
	
		
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}

}

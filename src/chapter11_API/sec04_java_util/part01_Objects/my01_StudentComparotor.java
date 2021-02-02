package chapter11_API.sec04_java_util.part01_Objects;

import java.util.Comparator;

public class my01_StudentComparotor implements Comparator<my01_Student>{

	@Override
	public int compare(my01_Student o1, my01_Student o2) {
		//o1 < o2 : 음수
		//o1 = o2 : 0
		//o1 > o2 : 양수
		if(o1.sno < o2.sno) {
			return -1;
		} else if (o1.sno == o2.sno) {
			return 0;
		} else {
			return 1;
		}
		//간단하게 다음 코드로 대체 가능
		//return Integer.comapre(o1.sno, o2.sno);
	}

} //end class

package chapter10_Exception.sec02_Runtime_Exception;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		/*
		 * [ArrayIndexOutOfBoundsException]
		 * 	 - 배열에서 인덱스 범위를 초과하여 사용할 경우 예외 발생
		 */
		int[] array = {1, 2, 3, 4, 5};
		
		for(int i=0 ; i<6 ; i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}

	} //end main

} //end class
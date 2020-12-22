package chapter13_Generic.sec02_GenericType.part01_NonGeneric;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("GLE");	//"GLE" 는 Object로 setting
		
		/*값을 가져올 때(받으려는 타입으로) casting 해야함 */
		//String car = box.get();
		String car = (String) box.get();

		box.set(new Apple());
		//Apple로 타입 변환해야함.
		Apple apple = (Apple) box.get();
		
	}

}

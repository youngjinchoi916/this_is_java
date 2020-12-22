package chapter13_Generic.sec06_WildcardType;

public class Course<T> {

	private String name;	//과정이름
	private T[] students;	//제네릭타입 배열
	
	public Course(String name, int capacity) {
		this.name = name;
		/* 제네릭타입 배열 초기화 */
		//타입파라미터가 어떤 타입인지 모르기 때문에 Object 배열로 초기화하고 타입파라미터로 강제타입변환한다.
		this.students = (T[]) new Object[capacity];		
	}
	
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
	//students 배열 순회하면서 앞쪽에 비어있는 배열에 수강생 추가한다.
	public void add(T t) {
		for(int i=0 ; i<students.length ; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}  
	} //end add
	
} //end class

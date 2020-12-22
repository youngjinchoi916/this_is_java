package chapter15_CollectionFramwork.sec04_Map.part01_HashMap;

public class my02_Student {

	public int sno;
	public String name;
	
	public my02_Student() {
		// TODO Auto-generated constructor stub
	}
	public my02_Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof my02_Student) {
			my02_Student student = (my02_Student) obj;
			return (this.name.equals(student.name)) && (this.sno == student.sno);		
		}
		return false;
	}
}

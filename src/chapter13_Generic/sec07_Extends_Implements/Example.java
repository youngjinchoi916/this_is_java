package chapter13_Generic.sec07_Extends_Implements;

public class Example {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setModel("smartTV");
		product.setCompany("samsung");
		
		Storage<Tv> storage = new StorageImp<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
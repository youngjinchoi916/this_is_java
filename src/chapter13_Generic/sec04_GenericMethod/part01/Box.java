package chapter13_Generic.sec04_GenericMethod.part01;

public class Box<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

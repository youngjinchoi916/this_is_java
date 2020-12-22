package chapter13_Generic.sec07_Extends_Implements;

public interface Storage<T> {
	public void add(T item, int index);

	public T get(int index);
}

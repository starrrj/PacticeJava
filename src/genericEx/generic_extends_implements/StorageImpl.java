package genericEx.generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}// constructor
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}//add
	
	@Override
	public T get(int index) {
		return array[index];
	} // get
	
} // end interface

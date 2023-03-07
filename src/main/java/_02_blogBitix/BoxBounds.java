package _02_blogBitix;

public class BoxBounds<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
	public static void main(String args[]) {
		BoxBounds<Integer> integerBox = new BoxBounds<Integer>();
		integerBox.set(new Integer(10));
		integerBox.inspect("some text");
	}
}

package _02_blogBitix;

public class Instantation {
	public static void main(String[] args) {
		Box<Integer> integerBox1 = new Box<Integer>();
		Box<Integer> integerBox2 = new Box<>();
		OrderedPair<String,Integer> p1 = new OrderedPair<>("Even",8);
	}
}

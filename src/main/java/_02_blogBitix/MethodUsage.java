package _02_blogBitix;

public class MethodUsage {
	Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
	Pair<Integer, String> p2 = new OrderedPair<>(3, "pear");
	boolean same = Method.<Integer, String>compare(p1, p2);
	boolean same2 = Method.compare(p1, p2);

}

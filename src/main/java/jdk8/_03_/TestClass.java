package jdk8._03_;

class A{
	public A() {}
	public A(String s) {
		this();
		System.out.println("A: " + s);
	}
}

class B extends A{
	public int B(String s) {
		System.out.println("B: " + s);
		return 0;
	}
}

class C extends B{
	private C() {
		super();
	}
	
	public C(String s) {
		this();
		System.out.println("C: " + s);
	}
	
	public C(int i) {}
}


public class TestClass {

}

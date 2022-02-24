package jdk8._07_;

public class TestOuter {
	public void myOuterMethod() {
		//new TestInner();
	}
	
	public class TestInner{}
	
	public static void main(String[] args) {
		TestOuter to = new TestOuter();
		//new TestInner();
		//new to.TestInner();
		//new TestOuter.TestInner();
		//new TestOuter().new TestInner();
	}

}

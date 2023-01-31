package simulador._01.javaClassDesign._01;

public class TestClass {
	public int methodA(int a) {return a*2;}//1
	public long methodA(int a) {return a}//2
	
	public static void main(String[] args) {
		int i=0;
		i = new TestClass().methodA(2);
		System.out.println(i);
	}
}

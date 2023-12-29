package simulador._01.javaClassDesign._09;

public class X {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof X &&  this.a == ((X)obj).a);
	}
	
//	public int hashCode() {
//		return 0;
//		return a;
//		return a+b;
//		return a*a;
//		return a/2;
//	}
	
}

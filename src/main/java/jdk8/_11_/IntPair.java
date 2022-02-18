package jdk8._11_;

public class IntPair {
	private int a;
	private int b;
	public void setA(int i) { this.a = i;}
	public int getA() {return this.a;}
	public void setB(int i) { this.b = i;}
	public int getB(int b) {return b;}
	
	public boolean equals(Object obj) {
		return ( obj instanceof IntPair && this.a == ((IntPair)obj).a && this.b == ((IntPair)obj).b);
	}
	
	public int hashCode() {
		
	}
}

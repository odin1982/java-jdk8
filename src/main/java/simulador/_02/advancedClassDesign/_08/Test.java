package simulador._02.advancedClassDesign._08;

interface I{}

enum enumA implements I {
	A,AA,AAA
};

class TestClass{
	public enum EnumB{
		B,BB,BBB;
		public Object clone() { return B;}
	}
	
	public static enum EnumC{ C,CC,CCC};
	//public static enum EnumD extends EnumC{DDD};
	
	public TestClass() {
		System.out.println(EnumC.CC.index());
	}
	
	public static void main(String[] args) {
		System.out.println(EnumC.valueOf("ccc"));
		System.out.println(EnumC.CCC.name());
	}
}


public class Test {

}

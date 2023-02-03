package simulador._01.javaClassDesign._07;

class SuperClass{
	public SuperClass() {}
	public SuperClass(int a) {}
	
}


public class SubClass extends SuperClass{
	int i,j,k;
	
	public SubClass(int m,int n) {
		i=m;
		j=m;
	}
	
	public SubClass(int m) {
		super(m);
	}
}

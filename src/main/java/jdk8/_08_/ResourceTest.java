package jdk8._08_;

public class ResourceTest {
	public static void main(String[] args) {
		Resource r = new Resource();
		Resource r2 = new Resource();
		boolean equals = r.equals(r2);
		System.out.println("are equals? -> " + equals);
		
		
		Resource res = new Resource();
		res.setData("Hola");
		
		Resource res2 = new Resource();
		res.setData("Hola");
		
		equals = res.equals(res2);
		System.out.println("are equals? -> " + equals);
	}

}

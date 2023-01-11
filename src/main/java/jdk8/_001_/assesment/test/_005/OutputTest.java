package jdk8._001_.assesment.test._005;

public class OutputTest {
	public static void main(String[] args) {
		System.out.println("a");
		
		try {
			System.out.println("b");
			throw new IllegalArgumentException();
		}catch(RuntimeException e) {
			System.out.println("c");
		}finally {
			System.out.println("d");
		}
		
		System.out.println("e");
	}

}

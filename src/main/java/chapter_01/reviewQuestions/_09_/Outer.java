package chapter_01.reviewQuestions._09_;

public class Outer {
	private int x = 24;
	public int getX() {
		String message = "x is ";
	
	
		class Inner{
			private int x = Outer.this.x;
			
			public void printX() {
				System.out.println(message + x);
			}
		}
		
		Inner in = new Inner();
		in.printX();
		return x;
	}
	
	public static void main(String[] args) {
		new Outer().getX();
	}

}

package chapter_01.reviewQuestions._12_;

public class Browsers {
	static class Browser{
		public void go() {
			System.out.println("Inside Browser");
		}
	}
	
	static class Firefox extends Browser{
		public void go() {
			System.out.println("Inside Firefox");
		}
	}
	
	static class IE extends Browser{
		@Override
		public void go() {
			System.out.println("Inside IE");
		}
	}
	
	public static void main(String[] args) {
		Browser b = new Firefox();
		IE e = (IE)b;//es un error en tiempo de ejecucion no se puede convertir un padre en un hijo
		e.go();
	}
}

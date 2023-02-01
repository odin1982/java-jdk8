package chapter_02._01.designPatternsAndPrinciples._01.designAndInterface.pag048;

public class Eagle implements Fly{

	@Override
	public int getWingSpan() throws Exception {
		return 15;
	}
	
	public void land() {
		System.out.println("Eagle is diving fast");
	}

}

package chapter_01.addingConstructorsFieldsMethodsEnum;

public enum OnlyOne {
	ONCE(true);
	
	private OnlyOne(boolean b) {
		System.out.println("constructing");
	}
	
	public static void main(String[] args) {
		OnlyOne firstCall = OnlyOne.ONCE;
		OnlyOne secondCall = OnlyOne.ONCE;// solo se imprime una vez constructing 
	}
}

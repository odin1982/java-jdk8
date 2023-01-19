package chapter_01.addingConstructorsFieldsMethodsEnum;

public enum Season {
	//El punto y coma es necesario si hay un constructor de enum
	WINTER("Low"),SPRING("Medium"),SUMMER("High"), FALL("Medium");
	
	private String expectedVisitors;
	
	// elconstructor del enum debe ser privado
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}

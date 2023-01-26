package chapter_01.reviewQuestions._07_;

public class IceCream {
	enum Flavors{
		VANILLA, CHOCOLATE, STRAWBERRY
	}
	
	public static void main(String[] args) {
		Flavors f = Flavors.STRAWBERRY;
		
		// Error compilacion: No se puede comparar un int con un Enum
		switch(f) {
		case 0: System.out.println("vanilla"); 
		case 1: System.out.println("chocolate");
		case 2: System.out.println("strawberry");
			break;
		default: System.out.println("missing flavor");
		}
	}
}

package simulador._02.advancedClassDesign._11;

enum Switch {
	ON, OFF
}

public class EnumTest {
	public static void main(String[] args) {
		Switch s = Switch.OFF;
		if(s == Switch.OFF) {
			System.out.println("It is off!");
		}
		
		if(s.equals(Switch.OFF)) {
			System.out.println("It is off!");
		}
		
		
		switch(s) {
		case Switch.OFF: System.out.println("It is off!");
		break;
		}
		
		switch(s) {
		case OFF: System.out.println("It is off!");
		break;
		}
		
		while(s) {
			System.out.println("It is off!");
		}
	}
}

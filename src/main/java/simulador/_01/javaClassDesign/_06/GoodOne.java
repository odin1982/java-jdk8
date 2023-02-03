package simulador._01.javaClassDesign._06;

public class GoodOne {
	int theval;
	
	public int hasCode() {
		return theval%3;
	}
	
	public boolean equals(Object obj) {
		try {
			//caso 1)
			//return true;
			
			//caso 2)
			return this == obj ? true : (theval % 3 == 0 && ((GoodOne)obj).theval%3==0) ? true:false;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// caso 1)
		//cuando dos objetos son iguales debe retornar el mismo hashCode, no se cumple la regla
		GoodOne g1 = new GoodOne();
		g1.theval = 2;
		GoodOne g2 = new GoodOne();
		g2.theval = 2;
		System.out.println("g1 hashCode: " + g1.hasCode());
		System.out.println("g2 hashCode: " + g2.hasCode());
		System.out.println("g1.equals(g2): " + g1.equals(g2));
		
		
	}
}

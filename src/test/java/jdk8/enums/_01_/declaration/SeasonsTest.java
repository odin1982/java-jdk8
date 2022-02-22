package jdk8.enums._01_.declaration;

import org.junit.jupiter.api.Test;

public class SeasonsTest {

	@Test
	public void testSeasonsEnum(){
		Class<Seasons> declaringClass = Seasons.SPRING.getDeclaringClass();
		System.out.println(declaringClass);
		
		String name = Seasons.FALL.name();
		System.out.println(name);
		
		int ordinal = Seasons.FALL.ordinal();
		System.out.println("ordinal -> " + ordinal);
	}
}

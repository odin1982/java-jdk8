package jdk8.enums._01_.declaration;

import org.junit.Test;

public class SeasonsTest {

	@Test
	public void testSeasonsEnum(){
		Class<Seasons> declaringClass = Seasons.SPRING.getDeclaringClass();
		System.out.println(declaringClass);
		
		String name = Seasons.FALL.name();
		System.out.println("name -> " + name);
		
		System.out.println("Seasons.FALL -> " + Seasons.FALL);
		
		int ordinal = Seasons.FALL.ordinal();
		System.out.println("ordinal -> " + ordinal);
		
		System.out.println("Seasons values:");
		Seasons[] values = Seasons.values();
		for(Seasons season : values) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		
		Seasons season = Seasons.valueOf("SPRING");
		System.out.println("season -> " + season);
		
		System.out.println( Seasons.valueOf("sprin"));
	}
}

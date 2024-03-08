package mx.codewars._02.basicSubClassesAdamAndEve;

import java.util.stream.Stream;

public class God {
	public static Human[] create() {
		Human[] humans = new Human[2];
		Man adam = new Man();
		Woman eve = new Woman();
		humans[0] = adam;
		humans[1] = eve;
		return humans;
	}
}

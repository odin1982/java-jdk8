package mx.codewars._10.pillars;

public class Pillars {
	public static int pillars(int numPill, int dist, int width) {
		if(numPill>1) {
			return ((numPill-1) * (dist*100)) + ((numPill * width) - (2*width ));
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(pillars(2,20,25));
		System.out.println(pillars(11,15,30));
	}
}

package mx.codewars._04.totalAmountOfPoints;



public class TotalPoints {
	public static void main(String[] args) {
		String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
		System.out.println(TotalPoints.points(games));
	}
	
	public static int points(String[] games) {
		int points = 0;
		for(String game:games) {
			int x = Integer.parseInt(""+game.charAt(0));
			int y = Integer.parseInt(""+game.charAt(2));
			if(x>y) {
				points+=3;
			}
			if(x<y) {
				points+=0;
			}
			if(x==y) {
				points+=1;
			}
		}
		return points;
	}

}

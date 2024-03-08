package mx.codewars._04.totalAmountOfPoints.solution1;

public class TotalPoints {
	public static void main(String[] args) {
		String[] games = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
		System.out.println(TotalPoints.points(games));
	}
  
    public static int points(String[] games) {
        int sum = 0;
        
        for (String s : games) {
          char x = s.charAt(0),
               y = s.charAt(2);
          
          sum += x > y ? 3 : x == y ? 1 : 0;
        }
        
        return sum;
    }
}
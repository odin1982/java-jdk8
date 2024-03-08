package mx.codewars._04.totalAmountOfPoints.solution2;
import java.util.Arrays;
public class TotalPoints {
  
    public static int points(String[] games) {
       return Arrays.stream(games)
                     .mapToInt(score -> score.charAt(0) - score.charAt(2))
                     .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                     .sum();
    }
}
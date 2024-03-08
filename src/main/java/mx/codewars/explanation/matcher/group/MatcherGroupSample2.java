package mx.codewars.explanation.matcher.group;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// * Indica que el caracter anterior se puede repetir cero o mas veces
public class MatcherGroupSample2 {
	public static void main(String[] args) {
		// Get the regex to be checked 
        String regex = "(G*G)"; 
  
        // Create a pattern from regex 
        Pattern pattern 
            = Pattern.compile(regex); 
  
        // Get the String to be matched 
        String stringToBeMatched 
            = "GFG FGF GFG"; 
  
        // Create a matcher for the input String 
        Matcher matcher 
            = pattern 
                  .matcher(stringToBeMatched); 
  
        // Get the current matcher state 
        MatchResult result 
            = matcher.toMatchResult(); 
        System.out.println("Current Matcher: "
                           + result); 
  
        while (matcher.find()) { 
            // Get the group matched using group() method 
        	System.out.println("Start :"+matcher.start()+", End : " + matcher.end()+", Group " + matcher.group());  
        } 
	}
}

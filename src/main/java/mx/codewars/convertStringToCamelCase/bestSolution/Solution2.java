package mx.codewars.convertStringToCamelCase.bestSolution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author odina
 * Pattter class A compiled representation of a regular expression.
 *
 *the expressions m.group(g) and s.substring(m.start(g), m.end(g))are equivalent.
 */
public class Solution2 {
	
	public static void main(String[] args) {
		toCamelCase("the-stealth-warrior");
	}
	
	static String toCamelCase(String s){
	    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s); // encuentra palabras que hagan match con el regex
	    StringBuffer sb = new StringBuffer();
	    while (m.find()) {
	    	System.out.println(m.toString());
	        m.appendReplacement(sb, m.group(1).toUpperCase());
	    }
	    System.out.println(m.appendTail(sb).toString());
	    return m.appendTail(sb).toString();
	  }
}

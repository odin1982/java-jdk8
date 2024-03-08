package mx.codewars.explanation.matcher.appendReplacement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author odina
 * Matcher.appendReplacement()
 * This method is used to implement append-and-replace step. First, It replaces compiled character or word with given input 
 * sequence and then it appends the given replacement string to the string buffer.
 *
 */
public class AppendReplacementSample {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("dog",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("'Let the dog come out of the bag'.To disclose a secret(Dog)");
		
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			m.appendReplacement(sb,"cat");
			System.out.println(sb.toString());
		}
	}
}

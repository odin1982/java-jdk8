package mx.codewars.convertStringToCamelCase.bestSolution;
import java.util.Arrays;

/*
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions
 * split : dividir
 * regex: 	[] es un rango
 * 			[-_] cualquier gion medio y guion bajo
 * 			split("[-_]") divide el string cuando veas un guion medio y un guion bajo
 * Arrays.stream(T[] array, int startInclusive, int endExclusive)	Returns a sequential Stream with the specified range of the specified array as its source.	
 */

class Solution{
	public static void main(String[] args) {
		toCamelCase("the-stealth-warrior");
	}

  static String toCamelCase(String str){
    String[] words = str.split("[-_]"); //divide el string cuando veas un guion medio y un guion bajo
    Arrays.stream(words, 1, words.length).forEach(System.out::println);
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}
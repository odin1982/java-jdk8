package mx.javaEsencial._07.removeExclamationMarks;
class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
    
    public static void main(String[] args) {
		String anyString = "!!Hola!!";
		System.out.println(removeExclamationMarks(anyString));
	}
}
package mx.codewars.convertStringToCamelCase;
class Solution{
  static String toCamelCase(String s){
    StringBuilder phrase = new StringBuilder(s);
    
    for(int positionString = 0; positionString < s.length(); positionString++){
      char c = s.charAt(positionString);
      if(String.valueOf(c).equals("-") || String.valueOf(c).equals("_")){
        phrase.replace(positionString + 1, positionString + 2, String.valueOf(s.charAt(positionString + 1)).toUpperCase());
      }
    }
    
    String ultima = phrase.toString().replaceAll("-","");
    ultima = ultima.replaceAll("_","");
    return ultima;
  }
}
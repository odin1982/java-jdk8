package utils;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	private Factory() {}
	
	public static List<String> getArrayListOfStrings(){
		List<String> birds =  new ArrayList<>();
		birds.add("perico");
		birds.add("cardenal");
		birds.add("guacamaya");
		return birds;
	}
}

package chapter_03.genericsAndCollections._01.reviewingOcaCollections._04.theDaimondOperator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDiamondOperator {
	public static void main(String[] args) {
		List names = new ArrayList();
		List<String> names2 = new ArrayList<String>();
		List<String> names3 = new ArrayList<>();// with diamond operator
		
		HashMap<String,HashMap<String,String>> map1 = new HashMap<String,HashMap<String,String>>();
		HashMap<String,HashMap<String,String>> map2 = new HashMap<>();  //easier
		
	}
}

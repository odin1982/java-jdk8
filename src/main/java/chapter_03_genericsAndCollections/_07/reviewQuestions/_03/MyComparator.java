package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}
	
	public static void main(String[] args) {
		String[] values = {"123","Abb","aab"};
		Arrays.sort(values,new MyComparator());
		for(String s: values) {
			System.out.print(s + " ");
		}
	}
	
}

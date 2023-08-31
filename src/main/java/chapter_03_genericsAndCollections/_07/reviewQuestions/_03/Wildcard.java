package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Wildcard {
	public void showSize(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		Wildcard card = new Wildcard();
		//ArrayDeque<?> list = new ArrayDeque<String>();
		//ArrayList<? super Date> list = new ArrayList<Date>();
		//List<?> list = new ArrayList<?>();
		//List<Exception> list = new LinkedList<java.io.IOException>();
		//Vector<? extends Number> list = new Vector<Integer>();
		//card.showSize(list);
	}

}

package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;



public class TestClass05 {
	public static void main(String[] args) {
		HashSet<Number> hs = new HashSet<Integer>();
		HashSet<? extends Number> hs2 = new HashSet<Integer>();//solucion
		
		/**
		 * Object -> Throwable -> Exception -> RuntimeException -> ClassCastException
		 */
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		
		/**
		 * Vector implements List
		 */
		List<String> list = new Vector<String>() ;
		
		List<Object> values = new HashSet<Object>();
		
		List<Object> objects = new ArrayList<? extends Object>();
		
		Map<String,? extends Number> hm = new HashMap<String,Integer>();
		
	}
}

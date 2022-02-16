package jdk8._04_;

import java.util.HashMap;
import java.util.Map;

public class _Book {
	private String isbn;
	public _Book(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean equals(Object o) {
		return (o instanceof _Book && ((_Book)o).isbn.equals(this.isbn));
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public static void main(String[] args) {
		Map<_Book,Integer> books =  new HashMap<>();
		_Book a = new _Book("A111");
		_Book b = new _Book("B222");
		books.put(a,10);
		books.put(b, 20);
		
		Integer integer = books.get(new _Book("A111"));// null, no es la misma referencia al objeto
		Integer integer2 = books.get(a);//true es la misma referencia
		System.out.println(integer);
		System.out.println(integer);
	}

}

package jdk8._01_;

public class Book {
	String isbn;
	String title;
	public Book(String isbn,String title) {
		this.isbn=isbn;
		this.title=title;
	}
	
	// Al sobreescribir equals no puedes agregar una Exception
	/*
	 public boolean equals(Object o) throws Exception{
		return true;
	}
	*/
	
	// No se esta sobreescribiendo equals se esta sobrecargando, nunca accede a este metodo
	/*
	 public boolean equals(Book o) {
		return true;
	}
	*/
	
	// No se esta sobreescribiendo, se esta sobrecargando
	/*
	public int equals(Book b) {
		return b.isbn.compareTo(this.isbn);
	}
	*/
	
	public boolean equals(Object b) throws NullPointerException{
		return true;
	}
	
	public static void main(String[] args) {
		Object b1 = new Book("1111","thinking in Java");
		Object b2 = new Book("1111","Java in 24 hrs");
		System.out.println(b1.equals(b2));
	}
	
}

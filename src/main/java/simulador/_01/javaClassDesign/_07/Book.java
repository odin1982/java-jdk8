package simulador._01.javaClassDesign._07;

public class Book {
	String isbn;
	String title;
	
	public Book(String isbn,String title) {
		this.isbn = isbn;
		this.title = title;
	}
	
	//public boolean equals(Object o) throws Exception{ return true; }
	//public boolean equals(Book o) { return true; } // es una sobrecarga del metodo equals
	//public int equals(Book b) { return b.isbn.compareTo(this.isbn); }// es una sobrecarga del metodo equals
	public boolean equals(Object b) throws NullPointerException{
		return true;
	}
	public static void main(String[] args) {
		Object b1 = new Book("1111","Thinking in Java");
		Object b2 = new Book("1111","Java in 24 hrs");
		System.out.println(b1.equals(b2));
	}
}

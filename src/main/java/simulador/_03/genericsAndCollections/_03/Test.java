package simulador._03.genericsAndCollections._03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book{
	String isbn;
	String title;
	
	public Book(String isbn,String title) {
		this.isbn = isbn;
		this.title = title;
	}
	
	public int compareTo(Book b) {
		return this.isbn.compareTo(b.isbn);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

public class Test {
	public static void main(String[] args) {
		List<Book> books = getBooksByAuthor("Ludium");
		Collections.sort(books,(b1,b2) -> b1.getTitle().compareTo(b2.getTitle()));
		Collections.sort(books);
	}

	private static List<Book> getBooksByAuthor(String string) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("234-234","libro1"));
		books.add(new Book("234-235","libro2"));
		books.add(new Book("234-236","libro3"));
		books.add(new Book("234-237","libro4"));
		return books;
	}
}

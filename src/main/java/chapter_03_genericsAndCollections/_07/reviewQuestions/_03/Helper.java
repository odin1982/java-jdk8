package chapter_03_genericsAndCollections._07.reviewQuestions._03;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *Object -> Throwable -> Exception -> IOException -> FileNotFoundException
 */
public class Helper {
	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}
	
	public static void main(String[] args) {
		Helper.printException(new FileNotFoundException("A"));
		Helper.printException(new Exception("B"));
		
		Helper.<Throwable>printException(new Exception("C"));
		Helper.<IOException>printException(new IOException("C"));
		Helper.<Exception>printException(new Exception("C"));
		
		
		Helper.<NullPointerException>printException(new NullPointerException("D"));
		Helper.printException(new Throwable("E"));
	}
}

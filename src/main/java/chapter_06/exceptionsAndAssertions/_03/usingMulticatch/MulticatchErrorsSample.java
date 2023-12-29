package chapter_06.exceptionsAndAssertions._03.usingMulticatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class MulticatchErrorsSample {
	public static void main(String[] args) {
		try {
			mightThrow();
		}catch(FileNotFoundException | IllegalStateException e) {}
		catch(InputMismatchException  | MissingResourceException e) {}
		catch(SQLException | ArrayIndexOutOfBoundsException e) {}
		//catch(FileNotFoundException | IllegalStateException e) {}
		catch(Exception e) {}
		catch(IOException e) {}
	}
	
	private static void mightThrow() throws DateTimeParseException, IOException{}
	
}

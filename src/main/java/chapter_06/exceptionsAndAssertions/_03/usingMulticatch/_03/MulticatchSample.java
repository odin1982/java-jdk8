package chapter_06.exceptionsAndAssertions._03.usingMulticatch._03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MulticatchSample {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("dolphinsborn.txt");// might throw IOException
			String text = new String(Files.readAllBytes(path));//might throw IOException
			LocalDate date = LocalDate.parse(text);//might throw DateTimeParseException
			System.out.println(date);
		}catch(DateTimeParseException e) {
			handleException(e);			 		//El codigo duplicado se ha ido en cierta forma, pero aun continumaos teniendo codigo duplicado
		}catch(IOException e) {
			handleException(e);	
		}
	}
	
	private static void handleException(Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	}
}

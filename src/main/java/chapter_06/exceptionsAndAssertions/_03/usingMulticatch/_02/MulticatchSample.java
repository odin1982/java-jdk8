package chapter_06.exceptionsAndAssertions._03.usingMulticatch._02;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class MulticatchSample {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("dolphinsborn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(Exception e) {
			e.printStackTrace();											//the duplicated code is gone, pero sigue siendo una mala solucion
			throw new RuntimeException(e);
		}
	}
}

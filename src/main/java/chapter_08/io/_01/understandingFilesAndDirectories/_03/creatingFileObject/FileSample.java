package chapter_08.io._01.understandingFilesAndDirectories._03.creatingFileObject;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		File file = new File("C:\\data\\zoo.txt");
		System.out.println("Existe el archivo: " + file.exists());
	}
}

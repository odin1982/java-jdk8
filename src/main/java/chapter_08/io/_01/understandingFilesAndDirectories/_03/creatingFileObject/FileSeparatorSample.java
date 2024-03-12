package chapter_08.io._01.understandingFilesAndDirectories._03.creatingFileObject;

public class FileSeparatorSample {
	public static void main(String args[]) {
		System.out.println("File Separator Windows: " + System.getProperty("file.separator"));
		System.out.println("File Separator Windows: " + java.io.File.separator);
	}
}

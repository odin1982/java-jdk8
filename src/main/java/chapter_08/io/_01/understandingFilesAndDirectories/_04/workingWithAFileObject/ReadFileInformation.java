package chapter_08.io._01.understandingFilesAndDirectories._04.workingWithAFileObject;

import java.io.File;

public class ReadFileInformation {
	public static void main(String[] args) {
		//File file = new File("C:\\data\\zoo.txt");
		File file = new File("C:\\data");
		System.out.println("File exists: " + file.exists());
		if(file.exists()) {
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent path: " + file.getParent());
			
			if(file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File Last Modified: " + file.lastModified());
			}else {
				for(File subfile: file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}
	}
}

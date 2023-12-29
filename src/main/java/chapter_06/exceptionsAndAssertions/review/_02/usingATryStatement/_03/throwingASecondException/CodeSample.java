package chapter_06.exceptionsAndAssertions.review._02.usingATryStatement._03.throwingASecondException;

import java.io.FileReader;
import java.io.IOException;

public class CodeSample {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
		}catch(IOException e) {
			try {
				if(reader != null) reader.close();
			}catch(IOException inner) {
				
			}
		}
		
	}
	
	private static FileReader read() throws IOException{
		throw new IOException();
	}
}

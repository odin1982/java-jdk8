package chapter_06.exceptionsAndAssertions.reviewQuestions._03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		try {
			throw new IOException();
		//}catch(FileNotFoundException | IOException e) {} //redundant
		//}catch(FileNotFoundException e| IOException e) {}	//only one variable name is allowed
		//}catch(FileNotFoundException | RuntimeException e) {} //la exception no se cacha
		//}catch(FileNotFoundException e| RuntimeException e) {}//only one variable name is allowed
		//}catch(IOException | RuntimeException e) {}	//ok
		//}catch(IOException e| RuntimeException e) {}//only one variable name is allowed
		
	}
}

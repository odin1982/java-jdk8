package chapter_06.exceptionsAndAssertions._05.rethrowingExceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class MultiCatchExample {
	public void multiCatch() throws SQLException,DateTimeParseException{
		try {
			parseData();
		}catch(SQLException | DateTimeParseException e) {            //aqui se esta duplicando el codigo en la firma del metodo como en el catch
			System.err.println(e);
			throw e;
		}
	}
	
	//solucion: En el catch poner unicamente el objeto Exception
	
	public void rethrowing() throws SQLException,DateTimeParseException{
		try {
			parseData();
		}catch(Exception e) {
			System.err.println(e);
			throw e;
		}
	}

	private void parseData() throws SQLException,DateTimeParseException{
		
	}
}

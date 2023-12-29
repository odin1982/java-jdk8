package chapter_06.exceptionsAndAssertions._01.throwAndThrows;

import java.sql.SQLException;

public class ThrowAndThrowsSample {
	public String getDataFromDatabase() throws SQLException{
		throw new UnsupportedOperationException();
	}
} 

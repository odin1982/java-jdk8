package jdk8._10_;

import java.io.IOException;

interface I1{
	void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.sql.SQLException;
}

public class I1I2Test implements I1,I2{

	@Override
	public void m1() throws IOException {
		// TODO Auto-generated method stub
		
	}

}

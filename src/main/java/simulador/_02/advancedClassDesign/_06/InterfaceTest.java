package simulador._02.advancedClassDesign._06;

import java.io.IOException;

interface I1{
	void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.sql.SQLException;
}

public class InterfaceTest implements I1,I2{

}

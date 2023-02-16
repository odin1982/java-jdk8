package simulador._01.javaClassDesign._11;

import java.io.FileNotFoundException;

public class Perform extends PerformWorkTest{
	@Override
	//public void perform_work() throws IOException{} //ok
	//public void perform_work() throws Exception{} //failed
	//public void perform_work() throws NullPointerException{} //ok
	//public void perform_work(){} //ok
	public void perform_work() throws FileNotFoundException{} //subclass IOException ok
}

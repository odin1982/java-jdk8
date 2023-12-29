package simulador._03.genericsAndCollections._01;

import java.util.List;

class Booby{}
class Dooby extends Booby{}
class Tooby extends Dooby{}

public class TestClass {
	Booby b = new Booby();
	Tooby t = new Tooby();
	
	public void addData1(List<? super Dooby> dataList) {
//		dataList.add(t);
//		dataList.add(b);
//		b = dataList.get(0);
//		t = dataList.get(0);
	}
	
	public void addData2(List<? extends Dooby> dataList) {
//		dataList.add(t);
//		dataList.add(b);
		b = dataList.get(0);
//		t = dataList.get(0);
	}
}

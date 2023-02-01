package simulador._01.javaClassDesign._04;

public class TaskBase {
	int getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 1;
		else return 0;
	}
}

class ParallelTask extends TaskBase{
	int getStatusCode(Object obj) throws NullPointerException{
		if(obj != null) return 1;
		else return 0;
	}
}
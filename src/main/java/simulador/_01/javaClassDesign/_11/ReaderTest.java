package simulador._01.javaClassDesign._11;

interface Classic{
	int version = 1;
	public void read();
}

class MediaReader implements Classic{
	int version = 2;
	public void read() {
		//insert code here
		//System.out.println(version);// it will print 2
		//System.out.println((Classic)version);//bad cast
		//System.out.println(((Classic)this).version);
		//System.out.println(this.Classic.version);
		//System.out.println(MediaReader.version);
	}
}

// what can be inserted in the code above so that it will print 1 when run?
public class ReaderTest {
	public static void main(String[] args) {
		MediaReader mr = new MediaReader();
		mr.read();
	}
}

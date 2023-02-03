package simulador._01.javaClassDesign._05.com.enthu;

public class Resource {
	private String data = "DATA";
	
	String getData() {
		return data;
	}
	
	void setData(String data) {
		this.data = data == null ? "":data;
	}
	
	boolean equals(Resource r) {
		return (r != null && r.getData().equals(this.getData()));
	}
	
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		
		System.out.println(r1.equals(r2));
	}
}

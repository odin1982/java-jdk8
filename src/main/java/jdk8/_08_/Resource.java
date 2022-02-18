package jdk8._08_;

public class Resource {
	private String data = "DATA";
	
	String getData() {
		return data;
	}
	
	void setData(String data) {
		this.data = data == null ? "": data;
	}
	
	boolean equals(Resource r) {
		return (r  != null && r.getData().equals(this.getData()));
	}

}

//El metodo equals no se esta sobreescribiendo se esta sobrecargando

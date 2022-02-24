package jdk8._11_;

public enum _02_Pets {
	static String prefix = "I am";
	String name;
	_02_Pets(String s){
		name = prefix + s;
	}
	
	public String getData() {
		return name;
	}
}

package jdk8._11_;

public enum _03_Pets {
	
	DOG(1,"D"),CAT(2,"C"){
		public String getData() { return type + name; }
	},
	FISH(3,"F");
	int type;
	String name;
	_03_Pets(int t,String s){
		this.name = s;
		this.type = t;
	}
	
	public String getData() {
		return name + type;
	}

}

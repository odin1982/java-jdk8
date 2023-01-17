package codingEqualsHashCodeToString.equals;

public class Lion {
	private int idNumber;
	private int age;
	private String name;
	
	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + idNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Lion)) return false;
		Lion otherLion = (Lion)obj;
		return this.idNumber == otherLion.idNumber;
	}
	

	
	
}

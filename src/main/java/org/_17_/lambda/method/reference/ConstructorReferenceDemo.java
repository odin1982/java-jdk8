package org._17_.lambda.method.reference;

public class ConstructorReferenceDemo {
	public static void main(String[] args) {
		Details d = Student::new;
		Student s = d.getStudents("Odin");
	}
	
}

class Student{
	Student(String name){
		System.out.println(name + " is successfully enrolled!");
	}
}

interface Details{
	public Student getStudents(String name);
}

package jdk8._001_.javaBuildingBlocks._01_.redundantImports;

import java.util.Random;
import java.lang.System; // redundant import
import jdk8._001_.javaBuildingBlocks._01_.redundantImports.RedundantClass; // redundant import in the same package Dont need it

public class ImportExample {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(10));
	}

}

package chapter_03._02.workingWithGenerics._01.workingWithGenerics._04.interactingWtihLegacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {
	public static void main(String[] args) {
		List numbers = new ArrayList<>();
		numbers.add(5);
		int result = numbers.get(0);//cannot convert Object into int
	}

}

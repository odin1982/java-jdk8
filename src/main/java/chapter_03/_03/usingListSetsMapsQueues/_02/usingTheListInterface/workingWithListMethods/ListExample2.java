package chapter_03._03.usingListSetsMapsQueues._02.usingTheListInterface.workingWithListMethods;

import java.util.ArrayList;

public class ListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("OH");
		list.add("CO");
		list.add("NJ");
		String state = list.get(0);
		int index = list.indexOf("NJ");
	}
}
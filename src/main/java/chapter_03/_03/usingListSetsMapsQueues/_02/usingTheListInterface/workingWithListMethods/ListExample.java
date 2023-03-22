package chapter_03._03.usingListSetsMapsQueues._02.usingTheListInterface.workingWithListMethods;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("SD");
		list.add(0,"NY");
		list.set(1, "FL");
		list.remove("NY");
		list.remove(0);
	}
}

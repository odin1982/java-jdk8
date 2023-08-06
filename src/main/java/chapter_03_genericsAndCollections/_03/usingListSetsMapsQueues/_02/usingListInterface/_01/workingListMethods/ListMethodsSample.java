package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._02.usingListInterface._01.workingListMethods;

import java.util.ArrayList;

public class ListMethodsSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("SD");
        list.add(0,"NY");
        list.set(1,"FL");
        list.remove("NY");
        list.remove(0);
    }
}

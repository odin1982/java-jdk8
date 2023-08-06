package chapter_03_genericsAndCollections._03.usingListSetsMapsQueues._02.usingListInterface._01.workingListMethods;

import java.util.ArrayList;

public class ListMethodsSample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("OH");
        list.add("CO");
        list.add("NJ");
        String state = list.get(0);
        int index = list.indexOf("NJ");
    }
}

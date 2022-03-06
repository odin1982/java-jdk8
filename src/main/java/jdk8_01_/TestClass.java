package src.main.java.jdk8_01_;

import java.util.NavigableSet;
import java.util.TreeSet;
/*
A NavigableSet implementation based on a TreeMap.
The elements are ordered using their natural ordering, or by a Comparator provided at set creation time,
depending on which constructor is used.

TreeSet ordena a sus elementos.


ceiling = Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
floor   = Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
lower   = Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
* */
public class TestClass {
    public static void main(String[] args) {
        NavigableSet<String> myset = new TreeSet<String>();
        myset.add("a");
        myset.add("b");
        myset.add("c");
        myset.add("aa");
        myset.add("bb");
        myset.add("cc");
        System.out.println(myset);
        System.out.println(myset.floor("a"));
        System.out.println(myset.ceiling("aaa"));
        System.out.println(myset.lower("a"));
        System.out.println(myset.higher("bb"));
    }
}

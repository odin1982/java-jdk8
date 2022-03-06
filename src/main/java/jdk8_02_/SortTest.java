package src.main.java.jdk8_02_;

import java.util.Comparator;
import java.util.Date;

class Person{
    String name;
    String dob;
    public Person(String name,String dob){
        this.name = name;
        this.dob = dob;
    }
}

class MySorter{
    public int compare(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
}

public class SortTest {
    public static int diff(Person p1, Person p2){
        return p1.compareTo(p2);
    }
    public static int diff(Date d1, Date d2){
        return d1.compareTo(d2);
    }
}

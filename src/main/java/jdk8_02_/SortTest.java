package src.main.java.jdk8_02_;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        ArrayList<Person> a1 = new ArrayList<>();
        a1.add(new Person("Paul","01012000"));
        a1.add(new Person("Peter","01011990"));
        a1.add(new Person("Patrick","01012002"));
        //java.util.Collections.sort(a1,(p1, p2) -> p1.dob.compareTo(p2.dob));
        //java.util.Collections.sort(a1,SortTest::diff);
        //java.util.Collections.sort(a1,new MySorter()::compare);
        //java.util.Arrays.sort(a1,SortTest::diff);
    }
}


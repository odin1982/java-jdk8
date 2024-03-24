package utils;

import commons.dto.Apple;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static List<Apple> createListApples(){
        List<Apple> list = new ArrayList();
        list.add(new Apple("green",5));
        list.add(new Apple("red",10));
        list.add(new Apple("blue",20));
        list.add(new Apple("green",3));
        list.add(new Apple("green",25));
        list.add(new Apple("yellow",30));
        list.add(new Apple("green",12));
        list.add(new Apple("orange",18));
        list.add(new Apple("green",90));
        list.add(new Apple("green",1));
        return list;
    }
}

package chapter_02._01._02.secondAttemptParameterizingColor._01.filteringColor;

import commons.dto.Apple;
import utils.Factory;

import java.util.ArrayList;
import java.util.List;


public class Farmer {
    public static void main(String[] args) {
        List<Apple> inventory = Factory.createListApples();
        List<Apple> greenApples = filterApplesByColor(inventory,"green");
        System.out.println(greenApples);
    }
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }
}

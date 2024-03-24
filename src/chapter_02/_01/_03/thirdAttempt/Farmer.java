package chapter_02._01._03.thirdAttempt;

import commons.dto.Apple;
import utils.Factory;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    public static void main(String[] args) {
        List<Apple> inventory = Factory.createListApples();
        List<Apple> greenApples = filterApples(inventory,"green",0,true);
        List<Apple> heavyApples = filterApples(inventory,"",15,false);
        System.out.println(greenApples);
        System.out.println(heavyApples);
    }
    public static List<Apple> filterApples(List<Apple> inventory,String color,int weight,boolean flag){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)){
                result.add(apple);
            }
        }
        return result;
    }
}

package chapter_02._01._01;

import commons.dto.Apple;

import java.util.ArrayList;
import java.util.List;

//In the context of a farm-inventory application, you have to implement a functionality to
//filter green apples from a list. Sounds easy, right?
public class Farmer {
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
}

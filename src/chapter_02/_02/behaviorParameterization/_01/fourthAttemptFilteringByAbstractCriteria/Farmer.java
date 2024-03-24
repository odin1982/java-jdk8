package chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria;

import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01.AppleGreenColorPredicate;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01.AppleHeavyWeightPredicate;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01.ApplePredicate;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01.AppleRedAndHeavyPredicate;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._02.AppleFancyFormatter;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._02.AppleFormatter;
import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._02.AppleSimpleFormatter;
import commons.dto.Apple;
import utils.Factory;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    public static void main(String[] args) {
        List<Apple> inventory = Factory.createListApples();
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        List<Apple> heavyApples = filterApples(inventory,new AppleHeavyWeightPredicate());
        List<Apple> readAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
        System.out.println(greenApples);
        System.out.println(heavyApples);
        System.out.println(readAndHeavyApples);

        System.out.println("-----------------------------------------------------------");
        prettyPrintApple(inventory,new AppleFancyFormatter());
        System.out.println("-----------------------------------------------------------");
        prettyPrintApple(inventory,new AppleSimpleFormatter());
    }
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p ) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
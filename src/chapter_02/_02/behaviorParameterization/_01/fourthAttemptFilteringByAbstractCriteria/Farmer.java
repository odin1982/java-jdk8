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
import java.util.function.Predicate;

public class Farmer {
    public static void main(String[] args) {
        List<Apple> inventory = Factory.createListApples();
        List<Apple> greenApples = filter(inventory, (Apple apple) -> "green".equals(apple.getColor()));
        List<Apple> heavyApples = filter(inventory,(Apple apple) ->apple.getWeight() > 150);
        List<Apple> readAndHeavyApples = filter(inventory,(Apple apple) -> ("red".equals(apple.getColor()) && apple.getWeight() > 150 ));
        List<Apple> yellowApples = filter(inventory,(Apple apple) -> "yellow".equals(apple.getColor()));
        System.out.println(greenApples);
        System.out.println(heavyApples);
        System.out.println(readAndHeavyApples);
        System.out.println("yellow apples: " + yellowApples);

        System.out.println("-----------------------------------------------------------");
        prettyPrintApple(inventory,new AppleFancyFormatter());
        System.out.println("-----------------------------------------------------------");
        prettyPrintApple(inventory,new AppleSimpleFormatter());
    }
    public static <T> List<T> filter(List<T> inventory, Predicate<T> p ) {
        List<T> result = new ArrayList<>();
        for (T e : inventory) {
            if (p.test(e)) {
                result.add(e);
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
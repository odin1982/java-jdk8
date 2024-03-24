package chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._02;

import commons.dto.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
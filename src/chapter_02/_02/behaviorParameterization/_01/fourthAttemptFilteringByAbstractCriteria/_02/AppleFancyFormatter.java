package chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._02;

import commons.dto.Apple;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}

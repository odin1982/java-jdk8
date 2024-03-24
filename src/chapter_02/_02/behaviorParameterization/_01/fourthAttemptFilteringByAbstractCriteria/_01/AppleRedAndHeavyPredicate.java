package chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01;

import chapter_02._02.behaviorParameterization._01.fourthAttemptFilteringByAbstractCriteria._01.ApplePredicate;
import commons.dto.Apple;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}

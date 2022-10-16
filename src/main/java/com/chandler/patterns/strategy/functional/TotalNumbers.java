package com.chandler.patterns.strategy.functional;

import java.util.List;
import java.util.function.Predicate;

public class TotalNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(getTotal(numbers, ignored -> true));
        System.out.println(getTotal(numbers, TotalNumbers::isEven));
        System.out.println(getTotal(numbers, number -> !isEven(number)));
    }

    private static int getTotal(List<Integer> numbers, Predicate<Integer> tester) {
        return numbers.stream()
                      .filter(tester)
                      .mapToInt(x -> x)
                      .sum();
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}

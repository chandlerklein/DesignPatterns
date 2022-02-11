package com.chandler.patterns.template;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class DuckSortTest {

    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        );

        System.out.println("Before sorting:");
        display(ducks);

        sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    private static void display(List<Duck> ducks) {
        ducks.forEach(System.out::println);
    }
}

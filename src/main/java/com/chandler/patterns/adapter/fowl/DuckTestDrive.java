package com.chandler.patterns.adapter.fowl;

public class DuckTestDrive {

    public static void main(String[] args) {
        var duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        var turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\n The DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testTurkey(Turkey duckAdapter) {
        duckAdapter.gobble();
        duckAdapter.fly();
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

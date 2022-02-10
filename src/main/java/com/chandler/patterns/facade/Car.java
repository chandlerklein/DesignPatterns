package com.chandler.patterns.facade;

public class Car {
    private final Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void start(Key key) {
        var doors = new Doors();
        boolean authorized = key.turns();
        if (authorized) {
            engine.start();
            updateDashboardDisplay();
            doors.lock();
        }
    }

    private void updateDashboardDisplay() {
        System.out.println("Updated dashboard display");
    }

    private record Engine() {
        public void start() {
            System.out.println("Started engine");
        }
    }

    public record Key() {
        public boolean turns() {
            return true;
        }
    }

    private record Doors() {
        public void lock() {
            System.out.println("Locked doors");
        }
    }

}

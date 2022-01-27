package com.chandler.patterns.decorator.cars;

public abstract class Car {

    String description = "Unknown car";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

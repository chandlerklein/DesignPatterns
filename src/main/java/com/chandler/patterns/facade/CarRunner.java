package com.chandler.patterns.facade;

import com.chandler.patterns.facade.Car.Key;

public class CarRunner {

    public static void main(String[] args) {
        new Car().start(new Key());
    }
}

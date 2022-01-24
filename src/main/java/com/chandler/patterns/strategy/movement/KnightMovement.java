package com.chandler.patterns.strategy.movement;

public class KnightMovement implements MovementBehavior {

    @Override
    public void move() {
        System.out.println("Moved knight in an L-shape");
    }
}

package com.chandler.patterns.strategy.movement;

public class BishopMovement implements MovementBehavior {

    @Override
    public void move() {
        System.out.println("Move bishop diagonally");
    }
}

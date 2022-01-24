package com.chandler.patterns.strategy.movement;

public class PawnMovement implements MovementBehavior {

    @Override
    public void move() {
        System.out.println("Move pawn one square up");
    }
}

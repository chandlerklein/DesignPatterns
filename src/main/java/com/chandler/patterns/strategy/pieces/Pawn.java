package com.chandler.patterns.strategy.pieces;

import com.chandler.patterns.strategy.movement.PawnMovement;

public class Pawn extends Piece {

    public Pawn() {
        movementBehavior = new PawnMovement();
    }
}

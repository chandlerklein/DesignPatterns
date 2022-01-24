package com.chandler.patterns.strategy.pieces;

import com.chandler.patterns.strategy.movement.BishopMovement;

public class Bishop extends Piece {

    public Bishop() {
        movementBehavior = new BishopMovement();
    }
}

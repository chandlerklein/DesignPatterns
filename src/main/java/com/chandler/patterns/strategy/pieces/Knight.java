package com.chandler.patterns.strategy.pieces;

import com.chandler.patterns.strategy.movement.KnightMovement;

public class Knight extends Piece {

    public Knight() {
        movementBehavior = new KnightMovement();
    }

}

package com.chandler.patterns.strategy.pieces;

import com.chandler.patterns.strategy.movement.MovementBehavior;

public abstract class Piece {

    MovementBehavior movementBehavior;

    public void movePiece() {
        movementBehavior.move();
    }

}

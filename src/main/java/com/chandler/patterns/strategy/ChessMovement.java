package com.chandler.patterns.strategy;

import com.chandler.patterns.strategy.pieces.Bishop;
import com.chandler.patterns.strategy.pieces.Knight;
import com.chandler.patterns.strategy.pieces.Pawn;
import com.chandler.patterns.strategy.pieces.Piece;

public class ChessMovement {

    public static void main(String[] args) {
        Piece piece = new Knight();
        piece.movePiece();

        Piece bishop = new Bishop();
        bishop.movePiece();

        Piece pawn = new Pawn();
        pawn.movePiece();
    }

}

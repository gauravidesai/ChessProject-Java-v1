package com.solarwindsmsp.chess;

public class PawnException extends Exception {

    private Pawn pawn;

    public PawnException( String message, Pawn pawn )
    {
        super( message );
        this.pawn = pawn;
    }

    public PawnException( String message, Pawn chessPiece, Throwable cause )
    {
        super( message, cause );
        this.pawn = chessPiece;
    }
}

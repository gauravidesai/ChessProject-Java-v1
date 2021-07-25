package com.solarwindsmsp.chess;

public class ChessboardException extends Exception {

    protected ChessBoard chessBoard;

    public ChessboardException( String message, ChessBoard chessBoard )
    {
        super( message );
        this.chessBoard = chessBoard;
    }

    public ChessboardException( String message, ChessBoard chessBoard, Throwable cause )
    {
        super( message, cause );
        this.chessBoard = chessBoard;
    }

    public ChessBoard getChessBoard()
    {
        return this.chessBoard;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "ChessboardException{" );
        sb.append( "chessBoard=" ).append( chessBoard );
        sb.append( '}' );
        return sb.toString();
    }
}

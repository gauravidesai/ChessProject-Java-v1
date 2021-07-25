package com.solarwindsmsp.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }


    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) throws InvalidPositionException {

        if ( !isLegalBoardPosition( xCoordinate, yCoordinate ) )
        {
            throw new InvalidPositionException( "Position: " + xCoordinate + "," + yCoordinate + " outwith board limits", this, xCoordinate, yCoordinate);
        }
        pawn.setXCoordinate( xCoordinate );
        pawn.setYCoordinate( yCoordinate );
        pawn.setChessBoard( this );
        this.pieces[xCoordinate][yCoordinate] = pawn;

    }

    public boolean isLegalBoardPosition( int xCoordinate, int yCoordinate ) throws InvalidPositionException
    {
        if ( xCoordinate < 0 || xCoordinate >= MAX_BOARD_WIDTH || yCoordinate < 0 || yCoordinate >= MAX_BOARD_HEIGHT )
        {
            //log.warn( "Coordinate: {},{} is outwith this board's limits", xCoordinate, yCoordinate );
            System.out.println("Coordinate is outwith this board's limits");
            return false;
        }

        if ( null != getPieceAtCoordinate( xCoordinate, yCoordinate ) )
        {
            //log.warn( "Coordinate: {},{} is already populated", xCoordinate, yCoordinate );
            System.out.println("Coordinate is already populated");
            return false;
        }

        return true;
    }

    public Pawn getPieceAtCoordinate( int xCoordinate, int yCoordinate )
    {
        return this.pieces[xCoordinate][yCoordinate];
    }


}

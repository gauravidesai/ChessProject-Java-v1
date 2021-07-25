package com.solarwindsmsp.chess;

public class InvalidMovementException extends PawnException {
    protected int xCoordinate;
    protected int yCoordinate;
    protected MovementType movementType;
    public InvalidMovementException(String invalid_movement, Pawn pawn, int newX, int newY, MovementType movementType)
    {
        super( invalid_movement, pawn );
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.movementType = movementType;
    }

    public InvalidMovementException( String invalid_movement, Pawn pawn, int xCoordinate, int yCoordinate, MovementType movementType, Throwable cause )
    {
        super( invalid_movement, pawn, cause );
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.movementType = movementType;
    }

    public int getxCoordinate()
    {
        return xCoordinate;
    }

    public int getyCoordinate()
    {
        return yCoordinate;
    }
}

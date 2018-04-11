package roverkata;

import roverkata.instructions.Instruction;

public class Rover {
    private final Plateau plateau;
    private Position position;

    public Rover(Plateau plateau, Position position) {
        this.plateau = plateau;
        this.position = position;
    }

    public Orientation getOrientation() {
        return position.orientation;
    }

    public void spinLeft() {
        switch (position.orientation){
            case WEST:
                position.orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                position.orientation = Orientation.EAST;
            case EAST:
                position.orientation = Orientation.NORTH;
            case NORTH:
                position.orientation = Orientation.WEST;
        }

    }
    public void spinRight() {
        switch (position.orientation){
            case WEST:
                position.orientation = Orientation.NORTH;
                break;
            case SOUTH:
                position.orientation = Orientation.WEST;
                break;
            case EAST:
                position.orientation = Orientation.SOUTH;
                break;
            case NORTH:
                position.orientation = Orientation.EAST;
                break;
        }
    }

    public Position getPosition() {
        return position;
    }

    public void move() {
        switch (position.orientation){
            case WEST:
                position = new Position(position.x-1,position.y,position.orientation);
                break;
            case SOUTH:
                position = new Position(position.x,position.y-1,position.orientation);
                break;
            case EAST:
                position = new Position(position.x+1,position.y,position.orientation);
                break;
            case NORTH:
                position = new Position(position.x,position.y+1,position.orientation);
                break;
        }
        position = plateau.wrapAroundIfOutisde(position);
    }

}

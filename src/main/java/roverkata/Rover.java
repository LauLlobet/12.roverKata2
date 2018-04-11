package roverkata;

public class Rover {
    private final Plateau plateau;
    private Position position;

    Rover(Plateau plateau, Position position) {
        this.plateau = plateau;
        this.position = position;
    }

    public Orientation getOrientation() {
        return position.getOrientation();
    }

    public void spinLeft() {
        position = position.spinLeft();
    }
    public void spinRight() {
        position = position.spinRight();
    }

    public Position getPosition() {
        return position;
    }

    public void move() {
        position = position.move();
        position = plateau.wrapAroundIfOutisde(position);
    }
}

package roverkata;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;
    private final Orientation orientation;

    public Position(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public Position spinLeft() {
        return new Position(x, y, orientation.spinLeft());
    }

    public Position spinRight() {
        return new Position(x, y, orientation.spinRight());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y &&
                orientation == position.orientation;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", orientation=" + orientation +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, orientation);
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Position move() {
        switch (getOrientation()){
            case WEST:
                return new Position(getX()-1, getY(), getOrientation());
            case SOUTH:
                return new Position(getX(), getY()-1, getOrientation());
            case EAST:
                return new Position(getX()+1, getY(), getOrientation());
            case NORTH:
                return new Position(getX(), getY()+1, getOrientation());
        }
        return this;
    }
}

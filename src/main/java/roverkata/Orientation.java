package roverkata;

public enum Orientation {
    NORTH,SOUTH,EAST,WEST;

    public Orientation spinLeft() {
        switch (this){
            case WEST:
                return Orientation.SOUTH;
            case SOUTH:
                return Orientation.EAST;
            case EAST:
                return Orientation.NORTH;
            case NORTH:
                return Orientation.WEST;
        }
        return this;
    }

    public Orientation spinRight() {
        switch (this){
            case WEST:
                return Orientation.NORTH;
            case SOUTH:
                return Orientation.WEST;
            case EAST:
                return Orientation.SOUTH;
            case NORTH:
                return Orientation.EAST;
        }
        return this;
    }
}

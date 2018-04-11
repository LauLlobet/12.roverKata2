package roverkata;

public enum Orientation {
    NORTH("N"),SOUTH("S"),EAST("E"),WEST("W");

    private String string;


    Orientation(String string) {
        this.string = string;
    }

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


    public static Orientation from(String result) {
        switch (result.charAt(0)){
            case 'N':
                return Orientation.NORTH;
            case 'W':
                return Orientation.WEST;
            case 'S':
                return Orientation.SOUTH;
            case 'E':
                return Orientation.EAST;
        }
        return Orientation.NORTH;
    }

    public String toString(){
        return this.string;
    }

}

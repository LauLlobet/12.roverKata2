package roverkata;

public enum Orientation {
    NORTH("N"),
    WEST("W"),
    SOUTH("S"),
    EAST("E");

    static {
        NORTH.left = WEST;
        SOUTH.left = EAST;
        EAST.left = NORTH;
        WEST.left = SOUTH;
        NORTH.right = EAST;
        SOUTH.right = WEST;
        EAST.right = SOUTH;
        WEST.right = NORTH;
    }

    private String string;
    private Orientation right;
    private Orientation left;

    Orientation(String string){
        this.string = string;
    }

    public Orientation spinLeft() {
        return left;
    }

    public Orientation spinRight() {
        return right;
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

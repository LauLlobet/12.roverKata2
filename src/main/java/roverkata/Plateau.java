package roverkata;

public class Plateau {
    private final int maxUp;
    private final int maxLeft;

    public Plateau(int maxLeft, int maxUp) {
        this.maxLeft = maxLeft;
        this.maxUp = maxUp;
    }

    public Position wrapAroundIfOutisde(Position position) {
        if(position.x> maxLeft){
            return new Position(position.x-maxLeft, position.y, position.orientation);
        }
        if(position.y> maxUp){
            return new Position(position.x, position.y+maxUp, position.orientation);
        }
        if(position.x< 0){
            return new Position(position.x+maxLeft, position.y, position.orientation);
        }
        if(position.y < 0){
            return new Position(position.x, position.y-maxUp, position.orientation);
        }
        return position;
    }
}

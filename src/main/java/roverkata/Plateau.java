package roverkata;

public class Plateau {
    private final int maxUp;
    private final int maxLeft;

    public Plateau(int maxLeft, int maxUp) {
        this.maxLeft = maxLeft;
        this.maxUp = maxUp;
    }

    public Position wrapAroundIfOutisde(Position position) {
        if(position.getX()> maxLeft){
            return new Position(position.getX()-maxLeft, position.getY(), position.getOrientation());
        }
        if(position.getY()> maxUp){
            return new Position(position.getX(), position.getY()+maxUp, position.getOrientation());
        }
        if(position.getX()< 0){
            return new Position(position.getX()+maxLeft, position.getY(), position.getOrientation());
        }
        if(position.getY() < 0){
            return new Position(position.getX(), position.getY()-maxUp, position.getOrientation());
        }
        return position;
    }

    public int getHeigth() {
        return maxUp;
    }
}

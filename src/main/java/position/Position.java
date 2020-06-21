package position;

public class Position {

    private int positionX;
    private int positionY;

    public Position(int x, int y){
        this.positionX = x;
        this.positionY = y;
    }

    public int getX(){
        return this.positionX;
    }

    public int getY(){
        return this.positionY;
    }

    public int measureDistance(Position aPosition){
        int distance = 0;

        distance = distance + Math.abs(this.positionX - aPosition.getX());
        distance = distance + Math.abs(this.positionY - aPosition.getY());

        return distance;
    }

    @Override
    public boolean equals(Object positionToBeCompared){

        Position culpritPosition = (Position) positionToBeCompared;

        return this.measureDistance(culpritPosition) == 0;

    }

    public void incrementX(int incrementValue) {

        this.positionX = this.positionX + incrementValue; // what if it collisions/reaches out of bounds?

    }
}

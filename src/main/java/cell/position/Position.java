package cell.position;

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

}

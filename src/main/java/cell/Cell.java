package cell;

import cell.position.Position;

public class Cell {

    private Position myPosition;

    public Cell(){}


    public Cell(int positionY, int positionX) {

        this.myPosition = new Position(positionX, positionY);

    }
}

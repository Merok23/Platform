package cell;

import position.Position;

public class Cell {

    private Position myPosition;
    private Boolean solid;

    public Cell(){}


    public Cell(int positionX, int positionY) {

        this.myPosition = new Position(positionX, positionY);
        this.solid = false;

    }

    public void changeStatusToSolid() {

        this.solid = true;

    }

    public boolean isSolid() {

        return solid;

    }

    public Position getPosition(){
        return this.myPosition;
    }


    //refactor just making it work for stopping.
    @Override
    public boolean equals(Object cellToBeCompared){

        Cell culpritCell = (Cell) cellToBeCompared;

        return this.myPosition.measureDistance(culpritCell.getPosition()) == 0;
    }
}

package map;
import cell.Cell;
import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import errorsandexceptions.PositionIsOutOfBounds;
import player.Player;
import position.Position;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<Cell> mapCells;
    private Player myPlayer;

    public Map () {
        
        this.mapCells = new ArrayList<Cell>();
        this.createTheMap(mapCells,40,40);
        this.myPlayer = new Player();

    }

    public Map (int height,int wide) {

        this.mapCells = new ArrayList<Cell>();
        this.createTheMap(mapCells, height, wide);
        this.makeGroundSolid(wide);
        this.myPlayer = new Player();

    }

    public void setCellSolidAt (int positionX, int positionY) throws PositionIsOutOfBounds {

        Cell requiredCell = this.searchForCell(positionX, positionY);

        requiredCell.changeStatusToSolid();

    }

    public boolean cellIsSolid (int positionX, int positionY) throws PositionIsOutOfBounds {

        Cell requiredCell = this.searchForCell(positionX, positionY);

        return requiredCell.isSolid();

    }

    public void setPlayerAt(int positionX, int positionY) throws PositionIsOutOfBounds, PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.positionIsValidForPlayer(positionX,positionY);
        myPlayer.setCentralPosition(this, positionX,positionY);

    }

    private void positionIsValidForPlayer(int positionX, int positionY) throws PositionIsOutOfBounds, PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.positionIsValid(positionX,positionY);
        this.myPlayer.surroundingsAreValid(this,positionX,positionY);

    }

    private void makeGroundSolid(int wide) {

        for(int positionX = 0; positionX < wide; positionX++){

            try { this.setCellSolidAt(positionX,0);}
            catch (PositionIsOutOfBounds positionIsOutOfBounds) {}

        }

    }

    private Cell searchForCell (int positionX, int positionY) throws PositionIsOutOfBounds {

        Cell cellIWantToFind = new Cell(positionX, positionY);
        int index = this.mapCells.indexOf(cellIWantToFind);

        if(index == -1) throw new PositionIsOutOfBounds();
        Cell foundCell = this.mapCells.get(index);

        return(foundCell);

    }

    private void createTheMap (List<Cell> mapCells, int height, int wide) {

        for(int row = 0; row < height; row++){

            for(int column = 0; column < wide; column++){
                Cell oneCell = new Cell (column,row);
                mapCells.add(oneCell);
            }

        }

    }

    public void positionIsValid(int positionX, int positionY) throws PositionIsOutOfBounds {

        this.searchForCell(positionX,positionY);

    }

    public Position returnPlayerPosition() {

        return myPlayer.getCentralPosition();

    }
}

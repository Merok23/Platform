package map;
import cell.Cell;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<Cell> mapCells;

    public Map () {

        this.mapCells = new ArrayList<Cell>();
        this.createTheMap(mapCells,40,40);

    }

    public Map (int height,int wide) {

        this.mapCells = new ArrayList<Cell>();
        this.createTheMap(mapCells, height, wide);

    }

    private void createTheMap (List<Cell> mapCells, int height, int wide) {

        for(int row = 0; row < height; row++){

            for(int column = 0; column < wide; column++){

                Cell oneCell = new Cell (column,row);
                mapCells.add(oneCell);

            }

        }

    }

    public void setCellSolidAt (int positionX, int positionY) {

        Cell requiredCell = this.searchForCell(positionX, positionY);

        requiredCell.changeStatusToSolid();

    }

    private Cell searchForCell (int positionX, int positionY) {

        Cell cellIWantToFind = new Cell(positionX, positionY);

        int index = this.mapCells.indexOf(cellIWantToFind);

        Cell foundCell = this.mapCells.get(index);

        return(foundCell);

    }

    public boolean cellIsSolid (int positionX, int positionY) {

        Cell requiredCell = this.searchForCell(positionX, positionY);

        return requiredCell.isSolid();

    }
}

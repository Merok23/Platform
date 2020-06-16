package map;
import cell.Cell;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<Cell> mapCells;

    public Map() {

        this.mapCells = new ArrayList<Cell>();
        this.createTheMap(mapCells,40,40);

    }

    private void createTheMap(List<Cell> mapCells, int height, int wide) {

        for(int row = 0; row < height; row++){

            for(int column = 0; column < wide; column++){

                Cell oneCell = new Cell (column,row);
                mapCells.add(oneCell);

            }

        }

    }

}

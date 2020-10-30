package player;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import errorsandexceptions.PositionIsOutOfBounds;
import map.Map;
import position.Position;

import java.util.ArrayList;
import java.util.List;

//The center of the body in a 5x3 is the 2, 1 (position) (god bless starting to count at 0)

public class Body {

    private List<Position> myPositions;

    public Body(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myPositions = new ArrayList<Position>();

        for(int x = positionX - 2; x < positionX + 2; x++){
            for(int y = positionY -1; y < positionY + 1; y++){

                try{
                    map.positionIsValid(x,y);
                } catch (PositionIsOutOfBounds positionIsOutOfBounds) {
                    throw new PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds();
                }

                Position onePosition = new Position (x,y);
                this.myPositions.add(onePosition);

            }
        }

    }

    public void checkIfSurroundingsAreValid(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {
            Body aBody = new Body(map,positionX,positionY); //checks for the positions around it.
    }
}

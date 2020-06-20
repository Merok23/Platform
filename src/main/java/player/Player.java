package player;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import map.Map;
import position.Position;

// player has to be 5x3 tiles

public class Player {

    private Position myCentralPosition;
    private Body myBody;


    public Player(){
        this.myBody = new Body();
    }
/*
    public Player(int positionX, int positionY){

        this.myPosition = new Position(positionX, positionY);

    }
*/

    public void setCentralPosition(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {
        
        this.myCentralPosition = new Position(positionX, positionY);
        this.myBody = new Body(map, positionX,positionY);

    }

    public Position getCentralPosition() {

        return this.myCentralPosition;

    }

    public void surroundingsAreValid(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myBody.checkIfSurroundingsAreValid(map,positionX,positionY);

    }
}

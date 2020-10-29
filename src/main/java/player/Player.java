package player;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import map.Map;
import player.movement.Movement;
import position.Position;

// player has to be 5x3 tiles

public class Player {

    private Position myCentralPosition;
    private Body myBody;
    private Movement myMovement;
    private Map myMap;


    public Player(){
        this.myBody = new Body();
    }


    public void setCentralPosition(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myMap = map;
        this.myCentralPosition = new Position(positionX, positionY);
        this.myBody = new Body(map, positionX,positionY);
        this.myMovement = new Movement(myCentralPosition);

    }

    public Position getCentralPosition() {

        return this.myCentralPosition;

    }

    public void surroundingsAreValid(Map map, int positionX, int positionY) throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myBody.checkIfSurroundingsAreValid(map,positionX,positionY);

    }

    public void moveToTheRight() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myBody.checkIfSurroundingsAreValid(myMap,myCentralPosition.getX()+1,myCentralPosition.getY());
        myMovement.moveRight();

    }

    public void moveToTheLeft() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        this.myBody.checkIfSurroundingsAreValid(myMap,myCentralPosition.getX()-1, myCentralPosition.getY());
        myMovement.moveLeft();
    }
}

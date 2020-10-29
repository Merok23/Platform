package player.movement;

import position.Position;

import java.util.Timer;

public class Movement {

    private Position myPosition;


    public Movement(Position initialPosition) {

        this.myPosition = initialPosition;

    }

    public void moveRight() {

        myPosition.incrementX(1);

    }

    public void moveLeft() {

        myPosition.incrementX(-1);

    }
}

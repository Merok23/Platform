package movementtest;

import junit.framework.Assert;
import junit.framework.TestCase;
import player.movement.Movement;
import position.Position;

//Acceleration after sec 5 is 0 and velocity is constant, formula in the report.

public class movementTest extends TestCase {

    public void test00MovementGetsCreatedAndItsReferenceIsNotNull(){

        Position myPosition = new Position (0,0);
        Movement myMovement = new Movement(myPosition);

        Assert.assertNotNull(myMovement);

    }

    public void test01YouCanMoveToTheRight() {

        Position myPosition = new Position(1, 1);
        Movement myMovement = new Movement(myPosition);

        myMovement.moveRight();

        Assert.assertEquals(2,myPosition.getX());


    }

    public void test02YouCanMoveToTheLeft(){

        Position myPosition = new Position(2,1);
        Movement myMovement = new Movement(myPosition);

        myMovement.moveLeft();

        Assert.assertEquals(1, myPosition.getX());


    }

}

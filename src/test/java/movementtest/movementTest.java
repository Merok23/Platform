package movementtest;

import junit.framework.Assert;
import junit.framework.TestCase;
import player.movement.Movement;
import position.Position;

//Acceleration after sec 5 is 0 and velocity is constant, formula in the report.

public class movementTest extends TestCase {

    public void test00MovementGetsCreatedAndItsReferenceIsNotNull(){

        Position myPosition = new Position (0,0);
        Movement myMovement = new Movement(myPosition, 0);

        Assert.assertNotNull(myMovement);

    }
/*
    public void test01YouCanMoveInOneDirectionForFiveSecondsWithMaxVelocityFive() throws InterruptedException {

        Position myPosition = new Position(1, 1);
        Movement myMovement = new Movement(myPosition,5);
        Thread aThread = new Thread();

        myMovement.accelerateRight();
        aThread.sleep(5000);

        Assert.assertEquals(5, myMovement.getVelocity());
        Assert.assertEquals(21,myPosition.getX());


    }

    public void test02YouCanMoveInOneDirectionForTwentySecondsAndThePositionIsCorrect() throws InterruptedException {

        Position myPosition = new Position(1, 1);
        Movement myMovement = new Movement(myPosition,5);
        Thread aThread = new Thread();

        myMovement.accelerateRight();
        aThread.sleep(20000);

        Assert.assertEquals(5, myMovement.getVelocity());
        Assert.assertEquals(96,myPosition.getX());


    }

*/
}

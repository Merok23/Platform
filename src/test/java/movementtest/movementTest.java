package movementtest;

import junit.framework.Assert;
import junit.framework.TestCase;
import player.movement.Movement;
import position.Position;

public class movementTest extends TestCase {

    public void test00MovementGetsCreatedAndItsReferenceIsNotNull(){

        Position myPosition = new Position (0,0);
        Movement myMovement = new Movement(myPosition);

        Assert.assertNotNull(myMovement);

    }

    public void test01YouCanMoveInOneDirection() throws InterruptedException {

        Position myPosition = new Position(1, 1);
        Movement myMovement = new Movement(myPosition);
        int maxSpeed = 5; // blocks per second
        Thread aThread = new Thread();

        myMovement.accelerateRight(maxSpeed);
        aThread.sleep(5000);

        Assert.assertEquals(5, myMovement.getVelocity());
        Assert.assertEquals(51,myPosition.getX());


    }

}

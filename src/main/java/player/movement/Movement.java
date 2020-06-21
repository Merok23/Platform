package player.movement;

import position.Position;

import java.util.Timer;

public class Movement {

    private int velocity; // acceleration is always 1 cell per second
    private Position myPosition;
    private Timer myTimer;
    private MovementAccelerateToTheRightTimerTask myTaskForGoingRight;


    public Movement(Position initialPosition,int maxVelocityDesired) {

        this.myTimer = new Timer();
        this.myPosition = initialPosition;
        this.velocity = 0;
        this.myTaskForGoingRight = new MovementAccelerateToTheRightTimerTask(this.myPosition, this.velocity,maxVelocityDesired, this.myTimer);

    }

    public void accelerateRight() {

        myTimer.scheduleAtFixedRate(this.myTaskForGoingRight,0, 1000);

    }

    public int getVelocity(){
        return this.myTaskForGoingRight.getVelocity();
    }
}

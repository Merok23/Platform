package player.movement;

import position.Position;

import java.util.Timer;

public class Movement {

    private int velocity; // acceleration is always 1 cell per second
    private Position myPosition;
    private Timer myTimer;
    private MovementAccelerateToTheRightTimerTask myTaskForGoingRight;


    public Movement(Position initialPosition) {

        this.myTimer = new Timer();
        this.myPosition = initialPosition;
        this.velocity = 0;
        this.myTaskForGoingRight = new MovementAccelerateToTheRightTimerTask(this.myPosition, this.velocity,5, this.myTimer);

    }

    public void accelerateRight(int maxSpeed) {

        myTimer.scheduleAtFixedRate(this.myTaskForGoingRight,0, 1);

    }

    public int getVelocity(){
        return this.myTaskForGoingRight.getVelocity();
    }
}

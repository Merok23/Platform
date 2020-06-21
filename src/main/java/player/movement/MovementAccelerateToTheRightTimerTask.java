package player.movement;

import position.Position;

import java.util.Timer;
import java.util.TimerTask;

public class MovementAccelerateToTheRightTimerTask extends TimerTask {

   private Position position;
   private int velocity;
   private int maxVelocity;
   private Timer myTimer;

    public MovementAccelerateToTheRightTimerTask(Position positionYouWannaMove, int yourInitialVelocity, int maxVelocityDesired, Timer thisTaskTimer){
        this.position = positionYouWannaMove;
        this.velocity = yourInitialVelocity;
        this.maxVelocity = maxVelocityDesired;
        this.myTimer = thisTaskTimer;
    }

    @Override
    public void run() {
        this.velocity++;
        this.position.incrementX(1*velocity);
        if (this.velocity == this.maxVelocity) myTimer.cancel();
    }

    public int getVelocity() {
            return this.velocity;
    }
}

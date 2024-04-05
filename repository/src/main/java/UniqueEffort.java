import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * UniqueEffort - a robot by (your name here)
 */
public class UniqueEffort extends Robot
{
	/**
	 * run: UniqueEffort's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.magenta, Color.gray, Color.pink); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
            ahead(100);
            turnGunRight(360);
            turnRight(90);
            turnGunLeft(360);
            turnLeft(90);

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
	    if (getGunHeat() != 0) {
            back(100);
            return;
        }

		// Replace the next line with any behavior you would like
		if (e.getDistance() < 100 && getEnergy() > 50) {
            fire(3);
        } else {
            fire(1);
        }
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
        turnRight(90 - e.getBearing());
        ahead(100);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
        back(100);
        turnRight(90);
	}
}

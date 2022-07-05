package Unicarioca;
import robocode.*;
import java.awt.Color;

public class Unicarioca extends Robot
{

	public void run() {
	
		while(true) {
		
    setColors ( Color.red,Color.white,Color.black); // corpo,arma,radar
			ahead(100);   // vai para frente 
			turnGunRight(360); // giro da arma 
			back(100);  // vai para trás
			turnGunRight(360); // giro da arma
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}

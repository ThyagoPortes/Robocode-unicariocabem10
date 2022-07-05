package Unicarioca;
import robocode.*;
import java.awt.Color;

public class Ben10 extends AdvancedRobot
{

	public void run() {
		
    setColors ( Color.green,Color.green,Color.black); // corpo,arma,radar
	
     setScanColor ( Color.green); // cor do radar 

    setBulletColor ( Color.green);  // cor da bala
	

    public void () 
	setMaxVelocity(5);
	setTurnGunRight(10000);
	
    
		
	while(true) {
		setahead(20);
		setback(20);  
		if (getEnergy() > 0.1) {
			fire(0.1);
		}
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

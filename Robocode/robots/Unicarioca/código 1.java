package mybackpack;
import robocode.*;
import java.awt.Color;
import robocode.ScannedRobotEvent;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Firstblood - a robot by (Renan Herculano)
 */
public class Firstblood extends AdvancedRobot
{
boolean movingForward;
	public void run() {
		setBodyColor(new Color(0, 0, 0));
		setGunColor(new Color(0, 0, 0));
		setRadarColor(new Color(0, 0, 0));
		setScanColor(new Color(0, 0, 0));
		
		while(true) {
			movingForward = true;
			setAhead(150);
			waitFor(new TurnCompleteCondition(this));
			setTurnRight(190);
			setAhead(150);
			turnGunRight(300);
			turnGunLeft(300);
		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}


	public void onHitByBullet(HitByBulletEvent e) {

		back(10);
	}
	
	public void onHitWall(HitWallEvent e) {
	
		reverseDirection();
	}	
	
	public void reverseDirection(){
		if(movingForward){
			setBack(200);
			movingForward = false;
			}else{
				setAhead(200);
				movingForward = true;
				}
	}
}
	
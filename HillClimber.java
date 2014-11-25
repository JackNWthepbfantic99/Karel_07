/**
 * HillClimbers move two steps across for each step of rise
 * 
* @author  Jack Navin-Weinstein
* @version Thursday, 13 November
 * 
 */

import edu.fcps.karel2.Display;

public class HillClimber extends Climber 
{
   public HillClimber()
   {
   super(8, 1, Display.NORTH, 1);
   }
	public HillClimber(int x, int y, int dir, int beep)
      {
		super (x, y, dir, beep);//TODO Call the appropriate superclass constructor
	   }
	
	public void climbUpRight() {
		//TODO Climb up one and across two
      move();
      turnRight();
      move();
      move();
      turnLeft();
	}
	
	public void climbUpLeft() {
		//TODO Climb up one and across two
      move();
      turnLeft();
      move();
      move();
      turnRight();
   }
	
	public void climbDownRight() {
		//TODO Climb down one and across two
      turnRight();
      move();
      move();
      turnRight();
      move();
      turnAround();
	}
	
	public void climbDownLeft() {
		//TODO Climb down one and across two
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      turnAround();
	}
}

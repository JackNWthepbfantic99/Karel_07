/**
 * StepClimbers climb steeply rising mountains, one step across for every step of rise
 * 
* @author <...>
* @version <...>
 * 
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class StepClimber extends Climber 
{
    public StepClimber()
   {
    super(8, 1, Display.NORTH, 1);
   }
	 public StepClimber(int x, int y, int dir, int beep)
   {
	 super(x, y, dir, beep);	//TODO Call the appropriate superclass constructor
	}
  
	
	public void climbDownRight(){
		//TODO Climb one step up and one across
      move();
      turnRight();
      move();
      turnLeft();
	}
	public void climbDownLeft() {
      move();
      turnLeft();
      move();
      turnRight();
	}
	
	public void climbUpRight() {
		//TODO Climb one step down and one across
      turnRight();
      move();
      turnLeft();
      move();
   }
	 
	public void climbUpLeft() {
		//TODO Climb one step down and one across
      move();
      turnLeft();
      move();
      turnRight();
	}
}

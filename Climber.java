import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class Climber extends Athlete 
  {
     public Climber()
    {
      super(8, 1, Display.NORTH, 1);
    }
      public Climber(int x, int y, int dir, int beep)
     {
        super(x, y, dir, beep);
     }
      public void climbupRight()
     { 
      move();
      move();
      turnRight();
      move();
      turnLeft();
     }
      public void climbdownRight()
     {
      turnRight();
      move();
      turnRight();
      move();
      move();
      turnAround();
     }
      public void climbupLeft()
     {
      move();
      move();
      turnLeft();
      move();
      turnRight();
     }
      public void climbdownLeft()
     {
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      turnAround();
     }
  }

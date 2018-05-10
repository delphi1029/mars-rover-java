package dl.marsrover.rover;

import dl.marsrover.position.Position;


public interface Rover {
	
	public void turnLeft();
	public void turnRight();
	public void move();
	public Position getPosition();

}

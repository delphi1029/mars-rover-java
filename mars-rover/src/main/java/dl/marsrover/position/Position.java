package dl.marsrover.position;

import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.direction.Direction;

public interface Position {
	
	
	public void setCoordinates(Coordinates coordinates);
	public Direction getDirection();
	public Coordinates getCoordinates();
	public void setDirection(Direction direction);
}

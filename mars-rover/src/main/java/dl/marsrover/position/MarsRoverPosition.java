package dl.marsrover.position;

import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.direction.Direction;

public class MarsRoverPosition implements Position {
	
	private Direction direction;
	private Coordinates coordinates;
	
	
	public MarsRoverPosition(Direction direction, Coordinates coordinates) {
		super();
		this.direction = direction;
		this.coordinates = coordinates;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Direction getDirection() {
		return direction;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}
}

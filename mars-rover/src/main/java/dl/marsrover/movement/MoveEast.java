package dl.marsrover.movement;

import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.command.axis.Coordinates2D;

public class MoveEast implements Move {
	
	private Coordinates coordinates;
	
	public MoveEast(Coordinates coordinates) {
		super();
		this.coordinates = coordinates;
	}

	public Coordinates move() {
		return new Coordinates2D(coordinates.getxAxis()+1, coordinates.getyAxis());
	}

}

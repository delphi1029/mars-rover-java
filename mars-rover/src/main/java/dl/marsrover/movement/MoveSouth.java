package dl.marsrover.movement;

import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.command.axis.Coordinates2D;

public class MoveSouth implements Move {

	private Coordinates coordinates;
	
	public MoveSouth(Coordinates coordinates) {
		super();
		this.coordinates = coordinates;
	}

	public Coordinates move() {
		return new Coordinates2D(coordinates.getxAxis(), coordinates.getyAxis()-1);
	}

}

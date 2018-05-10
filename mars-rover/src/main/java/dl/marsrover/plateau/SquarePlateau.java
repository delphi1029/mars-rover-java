package dl.marsrover.plateau;

import dl.marsrover.command.axis.Coordinates;

public class SquarePlateau implements Plateau {
	
	private Coordinates uperAxis;
	private Coordinates lowerAxis;
	
	public SquarePlateau(Coordinates uperAxis, Coordinates lowerAxis) {
		super();
		this.uperAxis = uperAxis;
		this.lowerAxis = lowerAxis;
	}

	public Coordinates getUperAxis() {
		return uperAxis;
	}

	public Coordinates getLowerAxis() {
		return lowerAxis;
	}
	
	
	
}

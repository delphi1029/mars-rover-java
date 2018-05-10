package dl.marsrover.rover;

import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.direction.Direction;
import dl.marsrover.exception.OutOfRangeException;
import dl.marsrover.movement.Move;
import dl.marsrover.movement.MoveEast;
import dl.marsrover.movement.MoveNorth;
import dl.marsrover.movement.MoveSouth;
import dl.marsrover.movement.MoveWest;
import dl.marsrover.plateau.Plateau;
import dl.marsrover.position.Position;


public class MarsRover implements Rover {
	
	private Position currentPosition;
	private Plateau plateau;
	
	public MarsRover(Position currentPosition, Plateau plateau) {
		super();
		this.currentPosition = currentPosition;
		this.plateau = plateau;
	}

	public void turnLeft() {
		Direction current = currentPosition.getDirection();
		current.turnLeft();
	}


	public void turnRight() {
		Direction current = currentPosition.getDirection();
		currentPosition.setDirection(current.turnRight());	
	}


	public void move() {
		Move move = null;
		Direction current = currentPosition.getDirection();
		Coordinates coordinates = currentPosition.getCoordinates();
		
		if((current.toString().equals("North"))) {
			move = new MoveNorth(coordinates);
		} else if((current.toString().equals("East"))) {
			move = new MoveEast(coordinates);
		} else if((current.toString().equals("West"))) {
			move = new MoveWest(coordinates);
		} else if((current.toString().equals("South"))) {
			move = new MoveSouth(coordinates);
		}
		
		Coordinates newCoordinates = move.move();
		if(isInRange(newCoordinates)) {
			currentPosition.setCoordinates(move.move());
		} else {
			throw new OutOfRangeException("Nars Rover Is going out of range");
		}
		
		
	}

	private boolean isInRange(Coordinates newCoordinates) {
		if(newCoordinates.getxAxis() > plateau.getUperAxis().getxAxis()
				|| newCoordinates.getyAxis() > plateau.getUperAxis().getyAxis() ) {
			return false;
		} 
		
		if(newCoordinates.getxAxis() < plateau.getUperAxis().getxAxis() 
				|| newCoordinates.getyAxis() < plateau.getUperAxis().getyAxis()) {
			return false;
		}
		return true;
	}
	

	public Position getPosition() {
		return this.currentPosition;
	}

	
	
	
	
	

}

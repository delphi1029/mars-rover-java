package dl.marsrover.direction;

public class WestDirection implements Direction {

	public Direction turnLeft() {
		return new SouthDirection();
	}

	public Direction turnRight() {
		return new NorthDirection();
	}
	
	public String toString() {
		return "West";
	}

}

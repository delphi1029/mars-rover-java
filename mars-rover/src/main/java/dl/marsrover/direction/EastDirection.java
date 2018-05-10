package dl.marsrover.direction;


public class EastDirection implements Direction {

	public Direction turnLeft() {
		return new NorthDirection();
	}

	public Direction turnRight() {
		return new SouthDirection();
	}

	public String toString() {
		return "East";
	}


}

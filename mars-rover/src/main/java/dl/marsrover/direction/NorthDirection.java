package dl.marsrover.direction;

public class NorthDirection implements Direction {

	public Direction turnLeft() {
		return new WestDirection();
	}

	public Direction turnRight() {
		return new EastDirection();
	}
	
	public String toString() {
		return "North";
	}

}

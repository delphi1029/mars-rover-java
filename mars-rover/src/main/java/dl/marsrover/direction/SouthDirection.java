package dl.marsrover.direction;

public class SouthDirection implements Direction {

	public Direction turnLeft() {
		return new EastDirection();
	}

	public Direction turnRight() {
		return new WestDirection();
	}
	
	public String toString() {
		return "South";
	}

}

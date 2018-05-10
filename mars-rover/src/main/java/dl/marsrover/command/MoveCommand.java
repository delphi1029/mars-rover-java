package dl.marsrover.command;

import dl.marsrover.rover.Rover;

public class MoveCommand  implements Command{

	private Rover rover;
	
	public MoveCommand(Rover rover) {
		super();
		this.rover = rover;
	}

	public void execute() {
		rover.move();
	}

}

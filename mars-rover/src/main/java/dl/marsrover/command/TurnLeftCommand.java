package dl.marsrover.command;

import dl.marsrover.rover.Rover;

public class TurnLeftCommand implements Command {

	private Rover rover;
	
	public TurnLeftCommand(Rover rover) {
		super();
		this.rover = rover;
	}

	public void execute() {
		rover.turnLeft();
	}

}

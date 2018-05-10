package dl.marsrover.command;

import dl.marsrover.rover.Rover;

public class TurnRightCommand implements Command {

	private Rover rover;
	
	public TurnRightCommand(Rover rover) {
		super();
		this.rover = rover;
	}

	public void execute() {
		rover.turnRight();
	}

}

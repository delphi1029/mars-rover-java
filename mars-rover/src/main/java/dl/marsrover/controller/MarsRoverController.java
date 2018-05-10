package dl.marsrover.controller;

import java.util.List;

import dl.marsrover.command.Command;

public class MarsRoverController implements Controller {

	private List<Command> listOfCommands;
	
	public MarsRoverController(List<Command> listOfCommands) {
		super();
		this.listOfCommands = listOfCommands;
	}

	public void executeCommands() {
		for(Command command : listOfCommands) {
			command.execute();
		}

	}

}

package dl.marsrover.rover;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import dl.marsrover.command.Command;
import dl.marsrover.command.TurnRightCommand;
import dl.marsrover.command.axis.Coordinates;
import dl.marsrover.command.axis.Coordinates2D;
import dl.marsrover.controller.Controller;
import dl.marsrover.controller.MarsRoverController;
import dl.marsrover.direction.Direction;
import dl.marsrover.direction.EastDirection;
import dl.marsrover.direction.NorthDirection;
import dl.marsrover.position.MarsRoverPosition;
import dl.marsrover.position.Position;

public class TestMarsRoverTurnRight {
	
	private Rover rover;
	private Position currentPosition;
	private Direction direction;
	private Coordinates coordinates;
	private Command command;
	
	
	@Before
	public void init() {
		coordinates = new Coordinates2D(1, 2);
		direction = new NorthDirection();
		currentPosition = new MarsRoverPosition(direction, coordinates);
		rover = new MarsRover(currentPosition);
		command = new TurnRightCommand(rover);
	}
	
	@Test
	public void testRover() {
		Controller  controller = new MarsRoverController(Arrays.asList(command));
		controller.executeCommands();
		
		Assert.assertEquals(rover.getPosition().getDirection().toString(), new EastDirection().toString());
	}

}

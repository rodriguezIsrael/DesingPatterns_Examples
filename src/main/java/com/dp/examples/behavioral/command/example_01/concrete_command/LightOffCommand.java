package com.dp.examples.behavioral.command.example_01.concrete_command;

import com.dp.examples.behavioral.command.example_01.Command;
import com.dp.examples.behavioral.command.example_01.receiver.Light;

/**
 * 
 * @since 11/11/2019
 * @author isivroes
 *
 */
public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOff();
	}

}

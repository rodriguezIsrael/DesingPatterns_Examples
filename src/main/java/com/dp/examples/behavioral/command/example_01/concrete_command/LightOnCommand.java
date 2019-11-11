package com.dp.examples.behavioral.command.example_01.concrete_command;

import com.dp.examples.behavioral.command.example_01.Command;
import com.dp.examples.behavioral.command.example_01.receiver.Light;

import lombok.Getter;

/**
 * 
 * @since 11/11/2019
 * @author isivroes
 *
 */
@Getter
public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
	}
	
	

}

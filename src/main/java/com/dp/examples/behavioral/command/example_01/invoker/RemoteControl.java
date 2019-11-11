package com.dp.examples.behavioral.command.example_01.invoker;

import com.dp.examples.behavioral.command.example_01.Command;

/**
 * @since 11/11/2019
 * @author isivroes
 *
 */
public class RemoteControl {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}

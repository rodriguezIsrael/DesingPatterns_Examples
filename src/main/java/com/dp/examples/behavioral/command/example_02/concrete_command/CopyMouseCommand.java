package com.dp.examples.behavioral.command.example_02.concrete_command;

import com.dp.examples.behavioral.command.example_02.Command;
import com.dp.examples.behavioral.command.example_02.receiver.Mouse;

public class CopyMouseCommand implements Command {

	Mouse mouse;

	public CopyMouseCommand(Mouse mouse) {
		this.mouse = mouse;
	}

	@Override
	public void execute() {

		mouse.copy();
	}

}

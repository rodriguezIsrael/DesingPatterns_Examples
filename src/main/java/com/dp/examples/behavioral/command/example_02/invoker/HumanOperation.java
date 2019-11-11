package com.dp.examples.behavioral.command.example_02.invoker;

import com.dp.examples.behavioral.command.example_02.Command;

public class HumanOperation {

	public void pressButton(Command command) {

		command.execute();
	}

}

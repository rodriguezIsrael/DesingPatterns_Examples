package com.dp.examples.behavioral.command.example_02.concrete_command;

import com.dp.examples.behavioral.command.example_02.Command;
import com.dp.examples.behavioral.command.example_02.receiver.Mouse;

public class SelectTextCommand implements Command {

	private Mouse mouse;
	private String selectedText = null;

	public SelectTextCommand(Mouse mouse, String selectedText) {
		this.mouse = mouse;
		this.selectedText = selectedText;
	}

	@Override
	public void execute() {
		mouse.setSelectedText(selectedText);
	}
}

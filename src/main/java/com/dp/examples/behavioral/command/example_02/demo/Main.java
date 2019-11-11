package com.dp.examples.behavioral.command.example_02.demo;

import com.dp.examples.behavioral.command.example_02.Command;
import com.dp.examples.behavioral.command.example_02.concrete_command.CopyMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.OffMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.OnMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.PasteMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.SelectTextCommand;
import com.dp.examples.behavioral.command.example_02.invoker.HumanOperation;
import com.dp.examples.behavioral.command.example_02.receiver.Mouse;

public class Main {

	public static void main(String... x) {

		HumanOperation mouseOperation = new HumanOperation();

		Mouse mouse = new Mouse();

		Command onMouse = new OnMouseCommand(mouse);
		Command offMouse = new OffMouseCommand(mouse);
		Command copy = new CopyMouseCommand(mouse);
		Command paste = new PasteMouseCommand(mouse);
		Command selectText = new SelectTextCommand(mouse, "Hola mundo");

		mouseOperation.pressButton(onMouse);
		mouseOperation.pressButton(selectText);
		mouseOperation.pressButton(copy);
		mouseOperation.pressButton(paste);
		mouseOperation.pressButton(offMouse);

	}
}

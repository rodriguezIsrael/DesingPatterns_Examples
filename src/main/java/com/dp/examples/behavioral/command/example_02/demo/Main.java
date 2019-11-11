package com.dp.examples.behavioral.command.example_02.demo;

import com.dp.examples.behavioral.command.example_02.Command;
import com.dp.examples.behavioral.command.example_02.concrete_command.CopyMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.OffMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.OnMouseCommand;
import com.dp.examples.behavioral.command.example_02.concrete_command.PasteMouseCommand;
import com.dp.examples.behavioral.command.example_02.receiver.Mouse;

public class Main {

	public static void main(String ...x) {
		
		Mouse mouse = new Mouse();
		
		Command onMouse = new OnMouseCommand(mouse);
		Command offMouse = new OffMouseCommand(mouse);
		Command copy = new CopyMouseCommand(mouse);
		Command paste = new PasteMouseCommand(mouse);
		
		offMouse.execute();
		copy.execute();
		paste.execute();
		mouse.setSelectedText("Hola mundo");

		
		onMouse.execute();
		mouse.setSelectedText("Hola mundo");
		copy.execute();
		paste.execute();
		offMouse.execute();
		
		paste.execute();
		

		
		
		
	}
}

package com.dp.examples.behavioral.command.example_01.demo;

import com.dp.examples.behavioral.command.example_01.Command;
import com.dp.examples.behavioral.command.example_01.concrete_command.LightOffCommand;
import com.dp.examples.behavioral.command.example_01.concrete_command.LightOnCommand;
import com.dp.examples.behavioral.command.example_01.invoker.RemoteControl;
import com.dp.examples.behavioral.command.example_01.receiver.Light;

public class Main {

	public final static void main(String[] args) {

		RemoteControl control = new RemoteControl();

		Light light = new Light();

		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);

		control.setCommand(lightsOn);
		control.pressButton();

//		light = null;
//		control.setCommand(lightsOff);
//		control.pressButton();
//
//		if (light == null) {
//			System.out.println("Se descompuso la luz");
//		} else 
			if (light.isOn()) {
			System.out.println("La luz esta prendida.");
		} else {
			System.out.println("La luz esta apagada");
		}

	}
}

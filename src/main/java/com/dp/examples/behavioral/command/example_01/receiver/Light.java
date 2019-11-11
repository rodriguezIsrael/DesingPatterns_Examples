package com.dp.examples.behavioral.command.example_01.receiver;

import lombok.Getter;

/**
 * @since 11/11/2019
 * @author isivroes
 *
 */
@Getter
public class Light {

	private boolean on;

	public void switchOn() {
		on = true;
		System.out.println("La luz esta prendida " + on);
	}

	public void switchOff() {
		on = false;
		System.out.println("La luz esta apagada " + on);
	}

}

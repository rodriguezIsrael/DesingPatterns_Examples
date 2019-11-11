package com.dp.examples.behavioral.command.example_02.receiver;

/**
 * 
 * @since 11/11/2019
 * @author isivroes
 *
 */
public class Mouse {

	/**
	 * Nos dice si el mouse esta prendido o apagado
	 */
	private boolean on;

	/**
	 * Texto copiado,pegado o cortado
	 */
	private String text;

	/**
	 * Texto de donde se copiara, o a donde se pegara o cortara
	 */
	private String selectedText;

	/**
	 * Prendemos el mouse
	 */
	public void on() {
		if (on) {

			System.out.println("El mouse ya se habia prendido antes.");

		} else {
			on = true;
			selectedText = null;
			text = null;
			System.out.println("Prendiendo mouse");
		}

	}

	/**
	 * Apagamos el mouse
	 */
	public void off() {
		if (!on) {
			System.out.println("El mouse ya se habia apagado antes.");
		} else {
			on = false;
			selectedText = null;
			text = null;
			System.out.println("Apagando mouse");
		}
	}

	/**
	 * Copiamos el texto
	 */
	public void copy() {
		if (!on) {
			System.out.println("No se puede copiar debido a que el mouse se encuentra apagado.");
		} else if (selectedText == null || selectedText.isEmpty()) {
			System.out.println("No se ha selecionado ningun texto para copiar. Primero seleccione un texto");
		} else {
			System.out.println("Texto copiado con exito: [" + selectedText + "]");
		}
	}

	/**
	 * Pegamos el texto
	 */
	public void paste() {
		if (!on) {
			System.out.println("No se puede pegar debido a que el mouse se encuentra apagado.");
		} else if (selectedText == null || selectedText.isEmpty()) {
			System.out.println("No se ha copiado ningun texto. Primero seleccione un texto y copielo");
		} else {
			text = selectedText;
			System.out.println("Texto pegado con exito: [" + text + "]");
		}
	}

	/**
	 * Se selecciona un texto
	 * 
	 * @param selectedText
	 */
	public void setSelectedText(String selectedText) {
		if (!on) {
			System.out.println("No se puede seleccionar texto debido a que el mouse esta apagado");
		} else {
			this.selectedText = selectedText;
		}

	}

}

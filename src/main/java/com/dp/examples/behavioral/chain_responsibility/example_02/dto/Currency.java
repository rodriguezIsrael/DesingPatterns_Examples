package com.dp.examples.behavioral.chain_responsibility.example_02.dto;

/**
 * Clase que simula cantidades de dinero
 * 
 * @since 07/11/2019
 * @author isivroes
 *
 */
public class Currency {

	/**
	 * Cantidad de dinero a retirar
	 */
	private int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	/**
	 * Se obtiene el dinero a retirar
	 * 
	 * @return int - Dinero a retirar
	 */
	public int getAmount() {
		return this.amount;
	}
}

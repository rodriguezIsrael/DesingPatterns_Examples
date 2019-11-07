package com.dp.examples.behavioral.chain_responsibility.example_02;

import com.dp.examples.behavioral.chain_responsibility.example_02.dto.Currency;

/**
 * Interface que se encarga de realizar el contrato de lo que debera de tener
 * cada objeto
 * 
 * @since 07/11/2019
 * @author isivroes
 *
 */
public interface DispenseChain {

	/**
	 * Se asigna el siguiente objeto de dispersion
	 * 
	 * @param nextChain - Objeto de dispersion
	 */
	void setNextChain(DispenseChain nextChain);

	/**
	 * Dispersion de dinero
	 * 
	 * @param currency
	 */
	void dispense(Currency currency);

}

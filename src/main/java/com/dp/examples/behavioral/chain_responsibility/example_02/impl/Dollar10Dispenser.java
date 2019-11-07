package com.dp.examples.behavioral.chain_responsibility.example_02.impl;

import com.dp.examples.behavioral.chain_responsibility.example_02.DispenseChain;
import com.dp.examples.behavioral.chain_responsibility.example_02.dto.Currency;

/**
 * @since 07/11/2019
 * @author isivroes
 *
 */
public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispersando " + num + " billetes de 10");

			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));

		} else {
			this.chain.dispense(currency);
		}
	}

}

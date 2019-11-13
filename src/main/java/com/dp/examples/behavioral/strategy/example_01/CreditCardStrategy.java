package com.dp.examples.behavioral.strategy.example_01;

import lombok.AllArgsConstructor;

/**
 * 
 * @since 13/11/2019
 * @author isivroes
 *
 */
@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExmpiry;

	@Override
	public void pay(int amount) {
		System.out.println(amount + " pago con tarjeta de credito");
	}

}

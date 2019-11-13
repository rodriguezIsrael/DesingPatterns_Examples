package com.dp.examples.behavioral.strategy.example_01;

import lombok.AllArgsConstructor;

/**
 * 
 * @since 13/11/2019
 * @author isivroes
 *
 */
@AllArgsConstructor
public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	@Override
	public void pay(int amount) {
		System.out.println(amount+ " pago usando paypal");
		
	}
	
	
}

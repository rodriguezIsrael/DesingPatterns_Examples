package com.dp.examples.behavioral.chain_responsibility;

import org.junit.jupiter.api.Test;

import com.dp.examples.behavioral.chain_responsibility.example_02.DispenseChain;
import com.dp.examples.behavioral.chain_responsibility.example_02.dto.Currency;
import com.dp.examples.behavioral.chain_responsibility.example_02.impl.Dollar10Dispenser;
import com.dp.examples.behavioral.chain_responsibility.example_02.impl.Dollar20Dispenser;
import com.dp.examples.behavioral.chain_responsibility.example_02.impl.Dollar50Dispenser;

/**
 * Clase de prueba patron de diseño, Cadena de responsabilidad
 * 
 * @since 05/11/2019
 * @author isivroes
 *
 */
public class ChainsResponsibility02Test {


	
	@Test
	public void chainResponsibilityTest() {

		DispenseChain c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		
	
		int amount = 940;
		
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		// process the request
		c1.dispense(new Currency(amount));
	}

}

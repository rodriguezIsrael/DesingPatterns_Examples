package com.dp.examples.behavioral.strategy.example_01.demo;

import com.dp.examples.behavioral.strategy.example_01.CreditCardStrategy;
import com.dp.examples.behavioral.strategy.example_01.PaypalStrategy;
import com.dp.examples.behavioral.strategy.example_01.ShoppingCart;
import com.dp.examples.behavioral.strategy.example_01.dto.Item;

/**
 * 
 * @since 13/11/2019
 * @author isivroes
 *
 */
public class Demo {

	public final static void main(String... z) {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.addItem(new Item("1234", 10));
		shoppingCart.addItem(new Item("4567", 40));

		shoppingCart.pay(new PaypalStrategy("isivroes@gmail.com", "MiPassWord"));
		shoppingCart.pay(new CreditCardStrategy("Isivroes", "any", "any", "today"));

	}

}

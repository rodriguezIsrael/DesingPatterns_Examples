package com.dp.examples.behavioral.strategy.example_01;

import java.util.ArrayList;
import java.util.List;

import com.dp.examples.behavioral.strategy.example_01.dto.Item;

/**
 * 
 * @since 13/11/2019
 * @author isivroes
 *
 */
public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	private int calculateTotal() {
		int sum = 0;

		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

}

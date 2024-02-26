package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Gift> gifts;

	public Employee(String name) {
		this.name = name;
		this.gifts = new ArrayList<Gift>();
	}

	public void receiveGift(Gift gift) {
		this.gifts.add(gift);
	}

	public String getName() {
		return name;
	}

	public List<Gift> getGifts() {
		return gifts;
	}
}
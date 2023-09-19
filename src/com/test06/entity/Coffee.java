package com.test06.entity;

public class Coffee extends Drink {
	public Coffee() {
		super(100);
	}

	@Override
	public String toString() {
		return "커피      " + getPrice() + "원";
	}
}
package com.test06.entity;

public class Juice extends Drink {
	public Juice() {
		super(200);
	}

	@Override
	public String toString() {
		return "주스      " + getPrice() + "원";
	}
}
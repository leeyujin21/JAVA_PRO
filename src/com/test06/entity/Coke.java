package com.test06.entity;

public class Coke extends Drink{
	public Coke(){
		super(50);
	}
	@Override
	public String toString() {
		return "콜라       "+getPrice()+"원";
	}
}
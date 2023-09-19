package com.test06.biz;

import com.test06.entity.Drink;

public class VendingMachineBiz implements IVendingMachineBiz{
	int balance = 1000; //현재 잔액
	Drink[] cartList = new Drink[3]; //구입 목록 배열
	int count = 0;
	public VendingMachineBiz() {}
	VendingMachineBiz(int balance, Drink[] cartList, int count){
		this.balance = balance;
		this.cartList = cartList;
		this.count = count;
	}
	@Override
	public void cartDrink(Drink drink) {
		
	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printDrinkList(Drink[] drinkList) {
		// TODO Auto-generated method stub
		
	}

}
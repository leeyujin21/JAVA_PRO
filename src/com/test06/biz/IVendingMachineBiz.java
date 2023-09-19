package com.test06.biz;

import com.test06.entity.Drink;

interface IVendingMachineBiz {
	abstract void cartDrink(Drink drink);
	abstract void printCart();
	abstract void printDrinkList(Drink[] drinkList);
}
package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {
	Drink drink = new Drink();
	Juice juice = new Juice();
	Coke coke = new Coke();
	Coffee coffee = new Coffee();
	VendingMachineBiz vmb = new VendingMachineBiz();
	Scanner sc = new Scanner(System.in);
	int printMenu() {
		System.out.println("=======================");
		System.out.println("1. 전체 음료수 및 잔액 보기");
		System.out.println("2. 주스 구입하기 ( 200원 )");
		System.out.println("3. 커피 구입하기 ( 100원 )");
		System.out.println("4. 코크 구입하기 ( 50원 )");
		System.out.println("5. 구입한 음료수 목록 보기");
		System.out.println("9. 종료");
		System.out.println("=======================");
		System.out.print("메뉴 입력 => ");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	void allInfo(){
		int balance = 1000;
		System.out.println("==============");
		System.out.println("음료수명    가격");
		System.out.println("==============");
		System.out.println(coffee);
		System.out.println(coke);
		System.out.println(juice);
		System.out.println("--------------");
		System.out.println("현재 잔액: "+balance + " 원");
	}
	void juiceSell() {
		vmb.cartDrink(juice);
		System.out.println(juice);
	}
	void coffeeSell() {
		
	}
	void cokeSell() {
			
	}
	public static void main(String[] args) {
		VendingMachineBiz vmb = new VendingMachineBiz();
		int sel=0;
		while(true) {
			try {
				switch(sel) {
				case 1: 
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 9:
					break;
				}
			}catch (NumberFormatException e) {
				System.out.println("입력형식이 맞지 않습니다. 다시 선택하세요.");
			}
		}
		
	}
}
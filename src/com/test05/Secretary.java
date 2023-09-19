package com.test05;

public class Secretary extends Employee implements Bonus {
	Secretary() {}

	Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		super.salary += pay * 0.8;
	}

	@Override
	public double tax(double tax) {
		tax = super.salary * 0.1;
		return tax;
	}
}
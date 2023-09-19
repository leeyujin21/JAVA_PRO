package com.test04;

abstract class Plane {
	String planeName;
	int fuelSize;
	int fuel;

	Plane() {}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	abstract int refuel(int refuel);

	abstract int flight(int distance);
}

class Airplane extends Plane {
	Airplane() {}
	
	Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	int flight(int distance) {
		super.fuelSize = super.fuelSize -(distance/10) *30;
		return super.fuelSize;
	}
	@Override
	public String toString() {
		return planeName + "   " + fuelSize;
	}
	@Override
	int refuel(int fuel) {
		super.fuelSize = super.fuelSize+fuel;
		return super.fuelSize;
	}
}

class Cargoplane extends Plane {
	Cargoplane() {}

	Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	int flight(int distance) {
		super.fuelSize = super.fuelSize -(distance/10) *50;
		return super.fuelSize;
	}
	@Override
	public String toString() {
		return planeName + "    " + fuelSize;
	}
	@Override
	public int refuel(int fuel) {
		super.fuelSize = super.fuelSize+fuel;
		return super.fuelSize;
	}
}

public class PlaneTest {
	public static void main(String[] args) {
		Airplane air = new Airplane("L777", 1000);
		Cargoplane cargo = new Cargoplane("C50", 1000);
		System.out.println("Plane  fuelSize");
		System.out.println("---------------");
		System.out.println(air);
		System.out.println(cargo);
		air.flight(100);
		cargo.flight(100);
		System.out.println("100 운항");
		System.out.println();
		System.out.println("Plane  fuelSize");
		System.out.println("---------------");
		System.out.println(air);
		System.out.println(cargo);
		air.refuel(200);
		cargo.refuel(200);
		System.out.println("200 주유");
		System.out.println();
		System.out.println("Plane  fuelSize");
		System.out.println("---------------");
		System.out.println(air);
		System.out.println(cargo);
	}
}
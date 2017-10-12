package com.iteso.world;

public class Vehicle {
	protected double fuel = 100;
	protected double speed = 1;


	public void speedUp() {
		this.speed += 4;
		this.fuel -= 2;
	}

	public void slowDown() {
		this.speed -= 4;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void loadFuel(double f) {
		this.fuel += fuel;
	}
}
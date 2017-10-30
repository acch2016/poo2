package com.iteso.world;

public class Man extends Animal {

	@Override
	public void move() {
		System.out.println("Hombre moviéndose con los dos pies");
		this.status = 3;
	}
	
	public void think() {
		System.out.println("Hombre pensando");
		this.status = 4;
	}

}

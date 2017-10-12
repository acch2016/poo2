package com.iteso.world;

public abstract class Animal {
	
	protected int status=0;
	
	public void sleep(){
		System.out.println("This animal is sleeping");
		this.status = 1;
	}
	
	public void die() {
		System.out.println("This animal is dead");
		this.status = 2;
	}
	
	public abstract void move();

}

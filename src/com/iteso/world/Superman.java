package com.iteso.world;

public class Superman extends Man implements Flyable {
	
	private int height = 0;
	private int power = 20;

	@Override
	public void rise() {
		if(height < Flyable.MAX_HEIGHT)	this.height += 40;
	}

	@Override
	public void descend() {
		if(height > 20)	this.height -= 20;
	}

	@Override
	public double getHeight() {
		return this.height;
	}
	
	public void runFast() {
		System.out.println("superman is running fast");
		
	}
	public void losePower(int krypto) {
		this.power -= krypto;
		System.out.println("Superman is losing power!!");
	}

}

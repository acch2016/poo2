package com.iteso.world;

public class Bird extends Animal implements Flyable {
	
	private int height = 1;

	@Override
	public void rise() {
		if(height < Flyable.MAX_HEIGHT) this.height +=1;
	}

	@Override
	public void descend() {
		if(height > 0) this.height -=1;
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public void move() {
		System.out.println("Ave en el aire");
		this.status=3;

	}

}

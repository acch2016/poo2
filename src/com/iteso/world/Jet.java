package com.iteso.world;

public class Jet extends Vehicle implements Flyable {
	private int height = 0;

	@Override
	public void rise() {
		if(height < Flyable.MAX_HEIGHT)	this.height += 10;

	}

	@Override
	public void descend() {
		if(height > 10)	this.height -= 10;

	}

	@Override
	public double getHeight() {
		return this.height;
	}

}

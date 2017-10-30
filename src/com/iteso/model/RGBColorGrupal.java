package com.iteso.model;

import shapes2d.Rectangle;

public class RGBColorGrupal {

	private int    red  = 127, green = 127, blue = 127;  
	private String name = "Gris";

	public RGBColorGrupal() {
		
	}
	
	public RGBColorGrupal(int red, int green, int blue) throws IllegalArgumentException {
		setRed(red);
		setGreen(green);
		setBlue(blue);
//		Llamada al tercer constructor
//		this(red, green, blue, "Indefinido");
	}
	
	public RGBColorGrupal(int red, int green, int blue, String name) throws IllegalArgumentException {
//		Llamada al segundo constructor
		this(red, green, blue);
		setName(name);
	}
	
	public int getRed() {
		return red;
	}

	public void setRed(int red) throws IllegalArgumentException {
		if(red < 0 || red > 255) throw new IllegalArgumentException("Red value must be between 0 and 255");
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) throws IllegalArgumentException {
		if(green < 0 || green > 255) throw new IllegalArgumentException("Green value must be between 0 and 255"); 
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) throws IllegalArgumentException {
		if(blue < 0 || blue > 255) throw new IllegalArgumentException("Blue value must be between 0 and 255");
		this.blue = blue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) this.name = name;
	}

	public int getCyan() {
		return 255 - this.red;
	}
	
	public String toString() {
		return String.format("{red: %d, green: %d, blue: %d, name: %s}", 
				              this.red, this.green, this.blue, this.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof RGBColorGrupal)) return false; 
		RGBColorGrupal rgbColor = (RGBColorGrupal) o;
		return this.blue == rgbColor.blue && this.green == rgbColor.green && this.red == rgbColor.red; 
	} 
	
	public RGBColorGrupal clone() {
		return new RGBColorGrupal(this.red, this.green, this.blue, this.name);
	}
	
}

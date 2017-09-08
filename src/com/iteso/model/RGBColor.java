package com.iteso.model;

public class RGBColor {

	private int red = 127, green = 127, blue = 127;
	private String name = "Gris";
	
	public RGBColor(){
		
	}
	
	public RGBColor( int red, int green, int blue ){
		setRed(red);
		setGreen(green);
		setBlue(blue);
		//Llamada a un tercer constructor
//		this(red,green,blue,"Indefinido");
		
	}
	
	public RGBColor( int red, int green, int blue, String name ){
		this(red,green,blue);
//		setRed(red);
//		setGreen(green);
//		setBlue(blue);
		setName(name);
	}
	
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		if( red >= 0 && red <=255 ) this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		if( green >= 0 && green <=255 ) this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		if( blue >= 0 && blue <=255 ) this.blue = blue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if( name != null ) this.name = name;
	}
	
	public int getCyan() {
		return 255 - this.red;
	}
	
	public int getMagenta() {
		return 255 - this.green;
	}
	
	public int getYellow() {
		return 255 - this.blue;
	}
	
	public int getRGB() {
		return 0;
	}
	 

}

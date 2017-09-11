package com.iteso.model;
//import shapes2d.Rectangle;
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
	public void print() {
		System.out.printf("{ %3d %3d %3d -> %-16s }\n",
				red, green, blue, name);
	}
	public void printRGB(){
		System.out.printf("Value RGB: %08X\n",getRGB());
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
	
	public void setCMY(int hex) {
		
	}
	
	public int getRGB() {
		int hexa = 0;
		hexa = red<<16 | green<<8 | blue;
		return hexa;
	}
	
	public void setRGB(int hex) {
		if( hex >= 0 && hex <= 0xFFFFFF ) {
			this.blue  = ( hex &     0xFF );
			this.green = ((hex &   0xFF00) >>  8);
			this.red   = ((hex & 0xFF0000) >> 16);
		}
	}
	
	
	
	public String toString(){
		return String.format("{red: %d, green: %d, blue: %d, name: %s}", 
				              this.red, this.green, this.blue, this.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof RGBColor)) return false; 
		RGBColor rgbColor = (RGBColor) o;
		return this.blue == rgbColor.blue && this.green == rgbColor.green && this.red == rgbColor.red; 
	} 
	
	public RGBColor clone() {
		return new RGBColor(this.red, this.green, this.blue, this.name);
	}
}

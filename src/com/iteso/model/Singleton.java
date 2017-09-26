package com.iteso.model;

public class Singleton {
	
	private int x = 0;
	
	public int getX() {
		return this.x;
	}
	
	public void incX() {
		this.x ++;
	}	
	
//	Arquitectura de un singleton
	
	private static Singleton instance = null; 
	
	//constructor
	private Singleton() {
		System.out.println("Se crea un singleton");
	}
	
	public static synchronized Singleton getInstance() {//method that returns the only instance?
		if(instance == null) instance = new Singleton();
		return instance;
	}
	
}

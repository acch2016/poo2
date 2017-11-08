package com.iteso.model;

public class GDrawer<Tipo> {
	
	private Tipo objectInside = null;
	
	public void put(Tipo o) {
		if(this.objectInside == null) this.objectInside = o;
	}
	
	public Tipo peek() {
		return this.objectInside;
	}
	
	public Tipo remove() {
		Tipo tmp = this.objectInside;
		this.objectInside = null;
		return tmp;
	}
	public String toString(){
		if(this.objectInside == null) return "Cajón Vacío";
		if(this.objectInside == this) return "Cajón conmigo mismo";
		return "Cajón con: " + this.objectInside;
	}
}

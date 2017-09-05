package tests;

import shapes2d.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {//metodo
		Rectangle r1 = new Rectangle();  // r1 = < 1.0, 1.0>
        //accediendo a los miembros
		r1.base      = 10.5; 			 // r1 = <10.5, 1.0>
		r1.height    =  6.5;			 // r1 = <10.5, 6.5>
		
//		Crear un rectángulo r2 cuya base será la mitad del perímetro de r1,
//		y la altura será el doble de la de r1.
		Rectangle r2 = new Rectangle();
		r2.base   = r1.perimeter() / 2;
		r2.height = 2 * r1.height;
		
//		Crear un rectángulo r3 cuya base será igual a la de r2, 
//		y la altura será el área del rectángulo r1.
		Rectangle r3 = new Rectangle();
		r3.base   = r2.base;
		r3.height = r1.area();
		
		r1.print();
		r2.print();
		r3.print();
		
		
		
	}

}

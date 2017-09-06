package tests;

import shapes2d.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {//metodo
		Rectangle r1 = new Rectangle();  // r1 = < 1.0, 1.0>
        //accediendo a los miembros
//		r1.base      = 10.5; 			 
		r1.setBase(10.5); 		    	 // r1 = <10.5, 1.0>
//		r1.height    =  6.5;			 
		r1.setHeight(6.5);  			 // r1 = <10.5, 6.5>
		
//		Crear un rectángulo r2 cuya base será la mitad del perímetro de r1,
//		y la altura será el doble de la de r1.
		Rectangle r2 = new Rectangle();
//		r2.base   = r1.perimeter() / 2;
		r2.setBase(r1.perimeter() / 2);
//		r2.height = 2 * r1.height;
		r2.setHeight( 2 * r1.getHeight());
		
//		Crear un rectángulo r3 cuya base será igual a la de r2, 
//		y la altura será el área del rectángulo r1.
		Rectangle r3 = new Rectangle();
//		r3.base   = r2.base;
		r3.setBase(r2.getBase());
		r3.setHeight(r1.area());
		
		r1.print();
		r2.print();
		r3.print();
		
//		r1.base = -6;
		r1.setBase(-6);
		r1.setHeight(0.5);
		r1.print();
		
		Rectangle r4 = new Rectangle();  // por default, height = 1.0
		r4.setHeight(-1);    // rechaza -1, preserva el valor anterior (1.0)
		r4.setHeight(0);     // rechaza  0, preserva el valor anterior (1.0)
		r4.setHeight(-2);    // rechaza -2, preserva el valor anterior (1.0)
		r4.print();  	     // r4 = <1.0, 1.0>
		
		Rectangle r5 = new Rectangle(12.5, -8.5); // r5 = < 12.5,1.0 >
		r5.print();
		
		Rectangle r6 = new Rectangle(20.5); // r6 = < 20.0,1.0 >
		r6.print();
	
		
	}

}

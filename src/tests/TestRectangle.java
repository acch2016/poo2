package tests;
import shapes2d.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {//metodo
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		r1.base = 10.5;//accediendo a los miembros
		r1.height = 6.5;
		
		Rectangle r2 = new Rectangle();
		r2.base = r1.perimeter()/2;
		r2.height = 2*r1.height;
		
		Rectangle r3 = new Rectangle();
		r3.base = r2.base ;
		r3.height = r1.area();

	}

}

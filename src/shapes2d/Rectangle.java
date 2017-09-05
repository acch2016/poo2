package shapes2d;

public class Rectangle {
	
//	Si no se inicializan, su valor por default es cero
	public double base   = 1.0; // private double base = 1.0;
	public double height = 1.0;
	
	public double area() {
		return base * height;
	}
	
	public double perimeter() {
		return 2 * (base + height);
	}
	
	public void print() {
		System.out.printf("{base: %5.1f, height: %5.1f, area: %7.2f, perimeter: %6.2f}\n",
				          base, height, area(), perimeter());
		
//		Si el objeto Rectangle está creado en la misma clase Rectangle
//		todos los miembros son públicos
//		Rectangle r = new Rectangle();
//		r.base ++;
        
        // si hacemos:
        // private double base = 1.0; en la linea 5
        // el atributo base se puede acceder ya que está en
        // esta misma clase Rectangle pero
        // en TestRectangle no se podría leer
	}

}

package shapes2d;

public class Rectangle {

	public double base = 1.0;// si hacemos: // private double base = 1.0;// 
	public double height = 1.0;
	
	public double area (){
		return base * height;
	};
	
	public double perimeter (){
		return 2 * (base + height);
	};
	
	public void print () {
		System.out.printf("base: %2.1f, height: %2.1f, area: %2.1f, perimeter: %3.1f\n",base, height, area(), perimeter());
		Rectangle r = new Rectangle();
		r.base = 0;// si hacemos: // private double base = 1.0; en la linea 5 // se puede acceder en esta misma clase Rectangle pero en test Rectangle habría el problema de no poder leer el atributo base
	};
	
	
	
}

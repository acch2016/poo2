package shapes2d;

public class Rectangle {
	
//	Si no se inicializan, su valor por default es cero
	private double base   = 1.0; // private double base = 1.0;
	private double height = 1.0;
	
	public final double baseMin;
	
	public Rectangle(){
		this.baseMin = 1.0;
	}
	
	public Rectangle( double base){
		this.baseMin = base;
		setBase(base);
	}
	
//	No es válido porque ya hay otro constructor que recibe un double
//	public Rectangle( double height){
//		setBase(height);
//	}
	
	//no tiene tipo devuelto
	//para no restringir la crecion de objetos
	public Rectangle( double base, double height){
		this.baseMin = 10 * Math.random();
		setBase(base);
		setHeight(height);
	}
	
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
	
	public void setBase(double base){
		//color cafe variebles de metodo / variables locales
//		base = b;
		//if (b >= 1.0) base = b;
		if (base >= 1.0) this.base = base;
		
	}
	
	public double getBase(){
		return base;
	}

	public void setHeight(double height) {
		if (height >= 1.0) this.height = height;
		
	}
	
	public double getHeight() {
		return height;
	}
	
//	Sobreescritura del método toString() de la clase Object
	@Override
	public String toString() {
		return String.format("{base: %.1f, height: %.1f}", this.base, this.height);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Rectangle)) return false; 
		Rectangle r = (Rectangle) o;
		return this.base == r.getBase() && this.height == r.getHeight(); 
	}
	
	@Override
	public Rectangle clone() {
		return new Rectangle(this.base, this.height);
	}
	
	@Override
	protected void finalize(){
//		this apunta al objeto que se eliminará
//		En la concatenación se invoca a toString() del objeto
		System.out.println("Se destruye: " + this);
	}

}

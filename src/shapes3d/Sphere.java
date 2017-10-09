package shapes3d;

public class Sphere extends Shape3D {
	private double radius = 1;

	public Sphere(double x, double y, double z, double radius) {
		super(x, y, z);
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius >= 1)this.radius = radius;
	}

	public void resize(double dr) {
		this.radius += dr;
		if(this.radius < 1) this.radius = 1;
	}

	@Override
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	
	@Override
	public double volume() {
		return 4.0/3 * Math.PI * radius * radius * radius;
	}
	
	@Override
	public String toString(){
		String s = String.format("Esfera\nRadio: %.1f\n", radius);
		return s + super.toString();
	}
}

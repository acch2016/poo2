package shapes3d;

public class Cylinder extends Shape3D {
	private double height=1,radius=1;
	
	
	public Cylinder(double x, double y, double z, double height, double radius) {
		super(x, y, z);
		this.height= height>1? height:1; 
		this.radius= radius>1? radius:1;
	}

	public double getHeight() {
		return height;
	}	

	public double getRadius() {
		return radius;
	}	

	@Override
	public double area() {		
		return 2 * Math.PI * this.radius * this.radius + 
			   2 * Math.PI * this.height * this.radius;
	}

	@Override
	public double volume() {
		return this.height * Math.PI * this.radius * this.radius;
	}
	
	public void resize(double dr, double dh){
		this.radius += dr;
		if(this.radius < 1) this.radius = 1;
		this.height += dh;
		if(this.height < 1) this.height = 1;
	}
	
	@Override
	public String toString(){
		String s = String.format("Cilindro\nRadio: %.1f\nAltura: %.1f\n", 
				                 this.radius, this.height);
		return s + super.toString();
	}

}

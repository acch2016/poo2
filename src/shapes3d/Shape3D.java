package shapes3d;

public abstract class Shape3D {
	protected double x=0, y=0, z=0;
	
	public Shape3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getZ(){
		return this.z;
	}
	
	public void move(double dx, double dy, double dz){
		this.x += dx;
		this.y += dy;
		this.z += dz;
	}
	
	public abstract double area();
	public abstract double volume();
	
	public String toString(){
		String s = String.format("Coordenadas : <%.1f, %.1f, %.1f>\n Area = %.1f\n Volumen = %.1f", 
				                 this.x, this.y, this.z, this.area(), this.volume());
		return s;
	}
	
	public static void main(String[] args) {
		int aPasar = (int) (32 * Math.random());
		System.out.println(aPasar);
	}

}

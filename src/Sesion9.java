
public class Sesion9 {
	
	private class Vec2{
		public double x,y;
		
		public Vec2(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public String toString(){
			return "Vec2";
		}
		
	}
	
	static void normalize(double x, double y){
		double m = Math.sqrt(x * x + y * y);
		x /= m;
		y /= m;
//		(x,y) = (0.6, 0.8)
		System.out.printf("%.2f, %.2f\n",x,y);
	}
	
//	static void normalize(double x, double y){
//		
//	}
	
	static void normalize(double[] array){
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x= 3.0, y=4.0;
		normalize(x,y);
		System.out.printf("%.2f, %.2f\n",x,y);
		
		
//paso por valor
		
		
		

	}

}

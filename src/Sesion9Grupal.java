import java.util.Arrays;

import javax.swing.JOptionPane;

import shapes2d.Rectangle;

public class Sesion9Grupal {

	private static class Vec2 {
		public double x, y;
		public Vec2(double x, double y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Vec2";
		}
	}
	
	static void normalize(double x, double y) {
		double m = Math.sqrt(x * x + y * y); 
		x /= m;
		y /= m;
		// (x, y) = (0.6, 0.8)
		System.out.printf("%.2f, %.2f\n", x, y);
	}
	
	static void normalize(Vec2 v) { //porque cuando hay un metodo static, no existe el this
		double m = Math.sqrt(v.x * v.x + v.y * v.y);
		v.x /= m;
		v.y /= m;
	}	
	
	static void normalize(double[] array) {
		double m = Math.sqrt(array[0] * array[0] + array[1] * array[1]);
		array[0] /= m;
		array[1] /= m;
	}
	
	static void toUnit(Vec2 v) {
		double m = Math.sqrt(v.x * v.x + v.y * v.y);
		v = new Vec2(v.x / m, v.y / m);
		System.out.printf("%.2f, %.2f\n", v.x, v.y);  // v = { 0.62, 0.78 }
	}
	
	public static void main(String[] args) {
		double x = 3.0, y = 4.0;
		normalize(x, y);
		System.out.printf("%.2f, %.2f\n", x, y);  // (x, y) = (3.0, 4.0)
		
		Vec2 v = new Vec2(x, y);
		normalize(v);
		System.out.printf("%.2f, %.2f\n", v.x, v.y);  // v = { 0.6, 0.8 }
		
		double[] xy = {x, y};
		normalize(xy);
		System.out.println(Arrays.toString(xy));  // xy[] = { 0.6, 0.8 }
		
		Vec2 u = new Vec2(4, 5);
		toUnit(u);
		System.out.printf("%.2f, %.2f\n", u.x, u.y);  // u = { 4.0, 5.0 }
		
		System.out.println(u);
		Rectangle r1 = new Rectangle(4, 6);
//		Llama al método toString() de Rectangle. Si no lo encuentra, llama al de Object
		System.out.println(r1);  
		JOptionPane.showMessageDialog(null, r1);
		
		Rectangle r2 = new Rectangle(4, 6);
		if(r1.equals(r2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		
		System.out.println(r1.equals("hola"));
		System.out.println(r1.equals(null));
		
		r1 = r2;          // r1 apunta al mismo objeto que apunta r2
		r1 = r2.clone();  // r1 apunta a un clon del objeto apuntado por r2
		r2.setBase(15);   // si cambia r2, no debe cambiar r1
		System.out.println(r1);
		System.out.println(r2);
		
	}

}

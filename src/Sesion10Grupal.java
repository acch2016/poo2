
import javax.swing.JOptionPane;

import shapes2d.Rectangle;

public class Sesion10Grupal {

	static class DoubleArray {
		public int id;
		public double[] dblArray;
		
		public DoubleArray(int id) {
			this.id       = id;
			this.dblArray = new double[100_000_000];
		}
		
		@Override
		protected void finalize() {
			System.out.println("Se elimina:" + id);
		}
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();  		// ( 1.0 x 1.0)
		Rectangle r2 = new Rectangle(4, 6);		// ( 4.0 x 6.0)
		Rectangle r3 = new Rectangle(10);		// (10.0 x 1.0)
		System.out.printf("Objetos creados: %s, %s, %s\n", r1, r2, r3);
		
		System.out.println(r1.baseMin);
		System.out.println(r2.baseMin);
		System.out.println(r3.baseMin);
//		r1.baseMin = 5;
		
		r2 = new Rectangle(7, 5);				// ( 7.0 x 5.0)
		System.gc();
		JOptionPane.showMessageDialog(null, "Pausa 1");
		
		r2 = null;
		System.gc();
//		JOptionPane.showMessageDialog(null, "Pausa 2");
		
//		VM Arguments: -Xmx8192M
//		En este ejercicio entra el recolector de basura porque:
//		  a) El nuevo arreglo ya no cabe en memoria
//		  b) Los arreglos anteriores perdieron el alcance y los puede borrar
//		for(int i = 0; i < 100_000; i ++) {
//			double[] array = new double[600_000_000]; // 4.8 mil millones (4GB)
//			array[0] = 10 * Math.random();
//			System.out.printf("%d, %.2f\n", i, array[0]);
//		}		
	
		for(int i = 0; i < 1_000; i ++) {
			DoubleArray da = new DoubleArray(i);
//			System.out.printf("Se crea: %d\n", da.id);
			System.gc();
		}
		
	}

}

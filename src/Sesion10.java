import shapes2d.Rectangle;

public class Sesion10 {
	
	static class DoubleArray{
		public int id;
		public double[] dbArray;
		public DoubleArray(int id, double[] dblArray) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(); //1x1
		Rectangle r2 = new Rectangle(4,6);//4x6
		Rectangle r3 = new Rectangle(10);//10x1
		
		System.out.printf("Objetos creados: %s, %s. %s\n ",r1,r2,r3);
//		Utilizar r2 para apuntar a un nuevo rectángulo.
		
		
		r2 = new Rectangle(7,5); //7x5
		System.gc();
//		JOptionPane.showMessageDialog(null, "Pausa 1");
		
		r2 = null;
		System.gc();
//		JOptionPane.showMessageDialog(null, "Pausa 2");
		
		
		// Run/Run configurations/ -Xmx8192M
//		for(int i=0;i<100_000;i++){
//			double[] array = new double[400_000_000];
//			array[0] = 10*Math.random();
//			System.out.printf("%d, %.2f\n",i,array[0]);
//		}
		
		for(int i=0;i<1_000;i++){
			double[] array = new double[1_000_000];
			array[0] = 10*Math.random();
			DoubleArray da = new DoubleArray(i, array);
			System.out.printf("Se crea: %d\n",da.id);
			System.gc();
		}
		
		

	}

}

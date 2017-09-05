import javax.swing.JOptionPane;

public class sesion5 {

	public static void main(String[] args) {
//		int aPasar = (int) (32 * Math.random());
//		System.out.println(aPasar);
		String precioS;
		double precio=0;
		do {
			precioS = JOptionPane.showInputDialog(null, "¿Cuál es el precio del producto?");
			if(precioS == null) break;
			if(precioS.equals(""))continue;
			try {				
				precio = Double.parseDouble(precioS);
				if(precio <= 0) JOptionPane.showMessageDialog(null, "El número debe ser mayor a 0");
			} catch(Exception exc) {
				JOptionPane.showMessageDialog(null, "Número real no válido");
			}
		} while(precio <= 0);
		if(precio > 0) 
			JOptionPane.showMessageDialog(null, String.format("El precio + IVA es: %.2f", precio * 1.16));
		
		double[][] A = { { 2.5, 3.6 },
				         { 8.2, 4.7 },
				         {-1.3, 3.8 }
		};
		double[][] B = { { 3.5, 2.4 },
		         		 {-2.2, 1.3 },
		         		 { 7.3, 2.2 }
		};
		int rows = A.length;
		int cols = A[0].length;
		double[][] C = new double[rows][cols];
		for(int row = 0; row < rows; row ++) {
			for(int col = 0; col < cols; col ++) {
				C[row][col] = A[row][col] + B[row][col];
				System.out.printf("%.1f\t", C[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void main1(String[] args) {
		String strVel = JOptionPane.showInputDialog("¿Cuál es tu velocidad actual?");
//		try {
//			double vel = Double.parseDouble(strVel);
//			if(vel >= 90) JOptionPane.showMessageDialog(null, "Foto infracción");
//			else JOptionPane.showMessageDialog(null, "Todo bien");
//			
//		} catch(NumberFormatException exc) {
//			JOptionPane.showMessageDialog(null, "Velocidad no válida\n" + exc);
//		}
//		JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
	
//		double vel = -1;
//		try {
//			vel = Double.parseDouble(strVel);
//		} catch(NumberFormatException exc) {
//		}		
//		if(vel < 0) JOptionPane.showMessageDialog(null, "Velocidad no válida");
//		else if(vel >= 90) JOptionPane.showMessageDialog(null, "Foto infracción");
//		else JOptionPane.showMessageDialog(null, "Todo bien");
//		JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");

		double  vel = 0;
		boolean error = false; 
		try {
			vel = Double.parseDouble(strVel);
			System.out.println(1 / 0);
		} catch(NumberFormatException exc) {
			error = true;
		} catch(Exception exc) {
			JOptionPane.showMessageDialog(null, "División no válida");
		}
		
		if(error) {
			JOptionPane.showMessageDialog(null, "Velocidad no válida");
		} else {
			if(vel < 0) JOptionPane.showMessageDialog(null, "De reversa");
			else if(vel >= 90) JOptionPane.showMessageDialog(null, "Foto infracción");
			else JOptionPane.showMessageDialog(null, "Todo bien");
		}
		
		JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
	}

}

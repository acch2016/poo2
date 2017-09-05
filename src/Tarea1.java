import javax.swing.JOptionPane;

public class Tarea1 {
	public static final int SIN_DECIMAL = 0;
	public static void main(String[] args){
		
		float costoFloat = 0.00f;
		float costoDec = 0.00f;
		float centFlo = 0.00f;
//		float roundedcentavosFlo = 0.00f;

		String costoStr = JOptionPane.showInputDialog("¿Cuánto cuesta el producto?");
		
		costoFloat = Float.parseFloat(costoStr);
		
		int pesos = (int) costoFloat; //Extraer parte entera
//		costoFloat = (float) pesos; //Commprobar que perdió los decimales
//		System.out.printf("parte entera %d centavos \n",pesos);
		
		costoDec = costoFloat - pesos;//Quedarse solo con la parte decimal
//		System.out.printf("parte decimal %.2f centavos \n",costoDec);//Debug. IMPRIME LOS 78 CENTAVOS (0.78)
		
		//Byte b = Byte.parseByte(costoStr,2);
		//pes = b << 2;
		//System.out.printf("El producto cuesta %d \n", pes);

		
		if ( SIN_DECIMAL == costoDec ) {
			
			String pesosStr = Integer.toString(pesos);
			String mssg = String.format( "El producto cuesta %s pesos", pesosStr);
			JOptionPane.showMessageDialog(null, mssg, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			centFlo = costoDec*(100.00f);
//			System.out.printf("El producto cuesta %d pesos con %.2f centavos \n", pesos, centFlo);//Debug. Imprime 78 centavos
			
//			roundedcentavosFlo = Math.round(centFlo);	
//			int centavos = (int) roundedcentavosFlo;
//			System.out.printf("El producto cuesta %d pesos con %d centavos \n",pesos, centavos);//Debug. Imprime ?
			
			String centStr = Float.toString(centFlo);
			
			Float obj = new Float(centStr);
			int centavos = obj.intValue();
			
			String pesosStr = Integer.toString(pesos);
			String centavosStr = Integer.toString(centavos);
//			System.out.printf("El producto cuesta %s pesos con %s centavos \n", pesosStr, centavosStr);
			
			String msg = String.format( "El producto cuesta %s pesos con %s centavos", pesosStr,centavosStr);
			JOptionPane.showMessageDialog(null, msg, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}
			
		
		
		
	}
}


/** Este es un programa en Java para solicitar y devolver el costo del producto a través de un cuadro de diálogo 
 * @author alejandrocanale
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class Tarea1_1 {
	
	/**Lo siguiente es un valor constante que se utiliza en el if para compararlo y saber si el usuario ingreso parte decimal.
	 */
	public static final int SIN_DECIMAL = 0;
	
	/** Este metodo es invocado automaticamente al ejecutar una clase en Java.
	 * @param args Lista de argumentos separados por espacio incluidos en la ejecucion del programa.
	 * @return No devuelve nada porque la aplicacion acaba al terminar el metodo (porque es void)
	 */
	public static void main(String[] args) {
		
		float costoFloat = 0.00f;
		float costoDec = 0.00f;
		float centFlo = 0.00f;

		String costoStr = JOptionPane.showInputDialog("¿Cuánto cuesta el producto?");

		costoFloat = Float.parseFloat(costoStr);

		int pesos = (int) costoFloat; //Extraer parte entera

		costoDec = costoFloat - pesos;//Quedarse solo con la parte decimal
		
		if ( SIN_DECIMAL == costoDec ) {
			
			String pesosStr = Integer.toString(pesos);
			String mssg = String.format( "El producto cuesta %s pesos", pesosStr);
			JOptionPane.showMessageDialog(null, mssg, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			centFlo = costoDec*(100.00f);
			
			String centStr = Float.toString(centFlo);
			
			Float obj = new Float(centStr);
			int centavos = obj.intValue();
			
			String pesosStr = Integer.toString(pesos);
			String centavosStr = Integer.toString(centavos);
			
			String msg = String.format( "El producto cuesta %s pesos con %s centavos", pesosStr,centavosStr);
			JOptionPane.showMessageDialog(null, msg, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}

/**Esta es una libreria que se importó para poder usar JOptionPane
 */
import javax.swing.JOptionPane;
/** This is a Java program that makes a currency exchange
* @author alejandrocanale
* @version 1.0
*/
public class Tarea2_ej3 {
	/** Este metodo es invocado automaticamente al ejecutar una clase en Java.
	 * @param args Lista de argumentos separados por espacio incluidos en la ejecucion del programa.
	 * @return No devuelve nada porque la aplicacion acaba al terminar el metodo (porque es void)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int estado = 0;
		float peso = 0.0f;
		float dollar = 0.0f;
		float euro = 0.0f;
		
		do{
			estado = Integer.parseInt(JOptionPane.showInputDialog("		Currency exchange: \n"
					+ "[1] Mexican Peso to Dollar\n"
					+ "[2] Dollar to Mexican Peso\n"
					+ "[3] Mexican Peso to Euro\n"
					+ "[4] Euro to Mexican Peso\n"
					+ "[5] Quit"));
			switch (estado){
			case 1: 
				peso = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the product in Mexican pesos: \n"));
				dollar = peso*0.055864f;
				String m = String.format( "%.2f Dollars", dollar);
				JOptionPane.showMessageDialog(null, m, "Mexican Peso to Dollar", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2: 
				dollar = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the product in Dollars: \n"));
				peso = dollar*17.9006158f;
				String me = String.format( "%.2f Mexican pesos", peso);
				JOptionPane.showMessageDialog(null, me, "Dollar to Mexican Peso", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: 
				peso = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the product in Mexican pesos: \n"));
				euro = peso*0.046632998f;
				String mes = String.format( "%.2f Euros", euro);
				JOptionPane.showMessageDialog(null, mes, "Mexican Peso to Euro", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4: 
				euro = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the product in Euros: \n"));
				peso = euro*21.4440427f;
				String mssg = String.format( "%.2f Mexican pesos", peso);
				JOptionPane.showMessageDialog(null, mssg, "Euro to Mexican Peso", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5: 
				String mssge = String.format( "Are you sure you want to quit?");
				JOptionPane.showMessageDialog(null, mssge, "Quit", JOptionPane.INFORMATION_MESSAGE);
				break;
			}			
		}while(estado != 5);
	}
}


/**Esta es una libreria que se importó para poder usar JOptionPane*/
import javax.swing.JOptionPane;

/** Este es un programa en Java que realiza la conjunción de componentes ARGB si el usuario ingresa 
 * valores decimales entre 0 y 255 para cada uno de los componentes ARGB
 * @author alejandrocanale
 * @version 1.0
 */
public class Tarea2_Ej2 {
	/** Este metodo es invocado automaticamente al ejecutar una clase en Java.
	 * @param args Lista de argumentos separados por espacio incluidos en la ejecucion del programa.
	 * @return No devuelve nada porque la aplicacion acaba al terminar el metodo (porque es void)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** The next line of code shows an Input Dialog for the decimal value and it saves the input as 
		 * a String 
		 */
		String alphaStr = JOptionPane.showInputDialog("Please enter the decimal ARGB Alpha component:");
		String redStr = JOptionPane.showInputDialog("Please enter the decimal ARGB Red component:");
		String greenStr = JOptionPane.showInputDialog("Please enter the decimal ARGB Green component:");
		String blueStr = JOptionPane.showInputDialog("Please enter the decimal ARGB Blue component:");


		/** This four lines of code are used to obtain the primitive data type (in this case a Integer) 
		 * from the String. The second argument of the method parseInt is for specify the radix */
		int blueInt = Integer.parseInt(blueStr, 10);

		int greenInt = Integer.parseInt(greenStr, 10);

		int redInt = Integer.parseInt(redStr, 10);

		int alphaInt = Integer.parseInt(alphaStr, 10);


		/* The number variable is used for saving all the ARGB components */
		long number = 0;
		
		number = blueInt;

		number |=  greenInt << 8;

		number |=  redInt << 16;

		number |=  alphaInt << 24;

	 	 /*The next line of code allows gives format according to the specified arguments. 
	 	  * X is for Hexadecimal values.*/
	   	  
		String mssg = String.format( "ARGB: %X", number);
		/* The next line of code is for showing a information message */
		JOptionPane.showMessageDialog(null, mssg, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}

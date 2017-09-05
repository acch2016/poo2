/**Esta es una libreria que se importó para poder usar JOptionPane 
 * 
 */
import javax.swing.JOptionPane;
/** Este es un programa en Java que realiza la separación de componentes ARGB si el usuario ingresa un valor Hexadecimal de 8 nibbles
 *
 * @author alejandrocanale
 * @version 1.2
 */
public class Tarea2v2 {
	
	/** Este metodo es invocado automaticamente al ejecutar una clase en Java.
	 * @param args Lista de argumentos separados por espacio incluidos en la ejecucion del programa.
	 * @return No devuelve nada porque la aplicacion acaba al terminar el metodo (porque es void)
	 */
    public static void main(String[] args) {
    	/**The next line of code shows an Input Dialog for the hexadecimal value and it saves the input as a String 
    	 * 
    	 */
   	 String argbStr = JOptionPane.showInputDialog("Please enter a ARGB hexadecimal value: ");
   		 
   	/**The next line of code is used to obtain the primitive data type (in this case a long) from the String
   	 */
   	 long number = Long.parseLong(argbStr, 16);
//   	 System.out.printf("Decimal value is: " + number + "  Hex value is: [%X]\n", number);
   	 
   	 /**The next line of code makes a mask from the number variable with two nibbles of ones 0xFF and it's saved on long blue
   	  */
   	 long blue = number & 0xFF;
   	 //   	 System.out.printf("Decimal value is: " + blue + "  Hex value is:  [%X]\n", blue);
   	 
   	 /**The next line of code makes a mask from the number variable with 0xFF00 and it's saved on long green 
   	  */
   	 long green = number & 0xFF00;
   	 
   	 /**The next line of code makes a bit shift to the right
   	  */
   	 green >>= 8; //green = green >> 8;
   	 //   	 System.out.printf("Decimal value is: " + green + "  Hex value is:  [%X]\n", green);
   	 
   	 /**The next line of code makes a mask from the number variable with 0xFF00 and it's saved on long red 
   	  */
   	 long red = number & 0xFF0000;
   	 
   	 /**The next line of code makes a bit shift to the right 
   	  */
   	 red >>= 16;
   	 //   	 System.out.printf("Decimal value is: " + red + "  Hex value is:  [%X]\n", red);
   	 
   	 /**The next line of code makes a mask from the number variable with 0xFF00 and it's saved on long alpha 
   	  */
   	 long alpha = number & 0xFF000000;
   	 
   	 /**The next line of code makes a bit shift to the right
   	  */
   	 alpha >>= 24;
//   	 System.out.printf("Decimal value is: " + alpha + "  Hex value is:  [%X]\n", alpha);
   	 
   	 
//   	 String [] strArray = { "Alpha:", "Red:", "Green:",  "Blue:" };
//   	 long [] longArray = { alpha, red, green, blue };
//   	 int i = 0, j = 0;
//   	 for(String s: strArray ){
//   		 System.out.printf("%-7s %3d [%02X]\n",s ,longArray[i++],longArray[j++]);
//   	 }
   	  

   	 /**The next line of code allows gives format according to the specified arguments. The minus sign is for left align; without sign is for right align; d is for integers; 
   	  * s is for strings; X is for Hexadecimal values; the numerical value its for specifying the numbers of characters.
   	  */
   	 String mssg = String.format( "%-7s %3d [%02X]\n%-7s %3d [%02X]\n%-7s %3d [%02X]\n%-7s %3d [%02X]","Alpha:",alpha,alpha,"Red:",red,red,"Green:",green,green,"Blue:",blue,blue);
   	 System.out.printf("%s\n",mssg);
//   	 String mssg = String.format( "Alpha:  %3d [%02X]\nRed:	%$3d [%02X]\nGreen:  %3d [%02X]\nBlue:   %3d [%02X]\n",alpha,alpha,red,red,green,green,blue,blue);
//   	 JOptionPane.showMessageDialog(null, mssg, "Messaje", JOptionPane.INFORMATION_MESSAGE);
   	 


   		 //https://www.tutorialspoint.com/java/java_characters.htm
    }

}



/** The following line of code is for importing Array Class */
import java.util.Arrays;

/** This program compares two arrays from the first element to the k element.
 *  If the content of the elements of the arrays are the same, 
 *  the Console shows true, if not, false.
 * @author alejandrocanale
 * @version 1.0
 */
public class tarea3_ej2 {
	/** Este metodo es invocado automaticamente al ejecutar una clase en Java.
	 * @param args Lista de argumentos separados por espacio incluidos 
	 * en la ejecucion del programa.
	 * @return No devuelve nada porque la aplicacion acaba al 
	 * terminar el metodo (porque es void)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {5, 12, 29,  8, 5, 33,  1, 6, 17 };
		int[] array2 = {1,  8,  5, 29, 6, 12, 33, 5, 3  };
		int k = 8;
		int[] arrRange1 = Arrays.copyOfRange(array1, 0, k);
		int[] arrRange2 = Arrays.copyOfRange(array2, 0, k);
   		Arrays.sort(arrRange1);
   		Arrays.sort(arrRange2);
   		boolean result = Arrays.equals(arrRange1, arrRange2);
   		System.out.println(result);

	}

}

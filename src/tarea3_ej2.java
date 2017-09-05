
/***/
import java.util.Arrays;

public class tarea3_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {5, 12, 29,  8, 5, 33,  1, 6, 17 };
		int[] array2 = {1,  8,  5, 29, 6, 12, 33, 5, 3  };
		int k = 8;
		
		int[] arrRange1 = Arrays.copyOfRange(array1, 0, k);
//   		System.out.println(Arrays.toString(arrRange1));
   		
		int[] arrRange2 = Arrays.copyOfRange(array2, 0, k);
//   		System.out.println(Arrays.toString(arrRange1));
     		
   		Arrays.sort(arrRange1);
//   		System.out.println(Arrays.toString(arrRange1));
   		
   		Arrays.sort(arrRange2);
//   		System.out.println(Arrays.toString(arrRange2));
   		
   		boolean result = Arrays.equals(arrRange1, arrRange2);
   		System.out.println(result);

	}

}

import java.util.Arrays;

public class sesion6 {

	public static void main(String[] args) {
		int rows = 10;
		int cols = 30;
		char[][] charMatrix = new char[rows][cols];
		// celda que está en la 4ta fila, 5ta columna
		char ch34 = charMatrix[3][4];  
		
		System.out.println((int) ch34); 
		System.out.printf("%c\n", ch34); /**Porque no imprime ni siquiera un 0 ?*/
		char[] row3 = charMatrix[3];  /**Que quizo decir con le paso uno de aca*/ // row3 apunta a la 4ta fila 
		row3[0] = 'A';  // modificamos la celda (3, 0) de la matriz
		System.out.println(row3);
		System.out.println(charMatrix[3]);
//		¿cuántas columnas tiene el décimo renglón? 
		System.out.println(charMatrix[9].length);
		
		
		char[][] charMatrix2 = new char[rows][];
		int columns0 = 56;
		int columns1 = 138;
		charMatrix2[0] = new char[columns0];
		charMatrix2[1] = new char[columns1];
		
		System.out.println(charMatrix2.length);    // cuántas filas
		System.out.println(charMatrix2[0].length); // columnas de primer fila
		System.out.println(charMatrix2[1].length); // columnas de segunda fila
//		System.out.println(charMatrix2[2]);        // charMatrix2[2] = null
//		System.out.println(charMatrix2[2].length); // NullPointerException
	
		int[] intArray1 = { 3, 6, 9, 12, 15};
		int[] intArray2 = intArray1;          // intArray2 apunta al mismo //  arreglo que intArray1 //complejidadd  constante
		intArray2[2] = 7;
		System.out.println(intArray1[2]);
		
		int[] intArray3 = intArray1.clone();  // intArray3 apunta a un clon del arreglo que apunta intArray1 // complejidadd lineal .clone()
		intArray3[0] = 2;
		System.out.println(intArray1[0]);
		System.out.println(intArray3[4]);
		System.out.println(intArray3);
		String s = Arrays.toString(intArray3);  // produce un String de la forma [elemento0, elemento1, ... ]
		System.out.println(s);
		
		String[] palabras = {"Ríos", "Jasso", "Darío"};
		System.out.println(palabras);
		System.out.println(Arrays.toString(palabras));
		
		
		double[][] A = { { 2.5, 3.6 },
		         		 { 8.2, 4.7 },
		         		 {-1.3, 3.8 }
		};
//		Clonación de matrices
		double[][] B = A.clone();
		for(int r = 0; r < A.length; r ++) {
			B[r] = A[r].clone();			
		}
		System.out.println();
//		Impresión de una matriz
		for(int r = 0; r < B.length; r ++)
			System.out.println(Arrays.toString(B[r]));
		
		System.out.println();
		double totalGastado = 0;
		double[] gastos = { 123.50, 56.80, 96.10 };
//		ciclo for-each con primitivos es de sólo lectura 
//		gasto = gastos[0];
//		gasto = gastos[1];
//		gasto = gastos[2];
		for(double gasto : gastos) {/**cuando es un lujo*/
//			System.out.println(gasto);
			totalGastado += gasto;
			gasto ++;  // modifica el valor de gasto pero no el del arreglo
		}
		System.out.println(totalGastado);
		System.out.println(Arrays.toString(gastos));
		
//		ciclo for-each con matrices
		double sum = 0;
		for(double[] currentRow : A) {
			for(double currentValue : currentRow) {
				sum += currentValue;
			}
		}
		System.out.println(sum);
		
		int R = 2 + (int) (19 * Math.random());
		System.out.println(R);
//		Matriz piramidal
		int[][] matrix = new int[R][];
		
	}

}

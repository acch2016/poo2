package tests;
import com.iteso.calendar.Date;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		a) Crear d1 como la fecha predeterminada. [1 line de code]
		Date d1 = new Date();
		System.out.println(d1);
		
//		b) Crear d2 como la fecha 31 de Diciembre de 2016. [1 line de code]
		Date d2 = new Date (31,12,2016);
		System.out.println(d2);
		
//		c) Crear d3 como el clon de d1. [1 line de code]
		Date d3 = d1.clone();
		System.out.println(d3);
		
//		d) Crear d4: con el day de d1, el mes de d2, el año de d3 y el formato 1. [1 line]
		Date d4 = new Date (d1.getDay(),d2.getMonth(),d3.getYear(),1);
		System.out.println(d4);
		
//		e) Crear d5 y asignar la fecha correspondiente al siguiente day de d2. [2 line]
		Date d5 = d2.clone();
		d5.next();
		System.out.println(d5);
		
		//esto antes que cambie d3 //////////
		Date d6 = d3.clone();
		
//		f) Cambiar el mes de d3 a Abril. [1 lines de code]
		d3.setMonth(4);
		System.out.println(d3);
		
//		g) Imprimir en consola el resultado de comparar d1 y d3. [1 lines de code]		
		System.out.println(d1.equals(d3));
		
//		h) Imprimir en consola el resultado de comparar d1 y d5. [1 lines de code]		
		System.out.println(d1.equals(d5));
		
/*		i) Imprimir en consola las cinco fechas anteriores en los tres formatos. Para ello,
		guarde las fechas en un arreglo y utilice ciclo for-each. [5 lines de code]        */
	
//  	 String [] strArray = { "Alpha:", "Red:", "Green:",  "Blue:" };
//  	 long [] longArray = { alpha, red, green, blue };
//  	 int i = 0, j = 0;
//  	 for(String s: strArray ){
//  		 System.out.printf("%-7s %3d [%02X]\n",s ,longArray[i++],longArray[j++]);
//  	 }

//		i'm going to print: d2, d3, d4, d5, d6
		
		Date [] dateArray = { d2, d6, d4, d5, d3 };
		int [] formatArray = { 0,1,2 };

		for( int f: formatArray ){
			for( Date d: dateArray ){
				d.setFormat(f);
				System.out.println(d);	
			}
		}
		
		

	}

}

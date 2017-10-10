package tests;

import com.iteso.calendar.DateGrupal;//duda
import com.iteso.calendar.DateTime;

public class TestDateTime{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Sea time1 la fecha/hora actual.
		DateTime time1 = new DateTime();
		
//		2. Sea time2 la hora 0:26:03 con la fecha actual.
		DateTime time2 = new DateTime(0,26,3);
		
//		3. Sea time3 la hora 11:59:59 PM con fecha 31-Dic-2017.
		DateTime time3 = new DateTime(11,59,59,31,12,2017);
		
//		4. Sea time4 el segundo siguiente a time3.
		DateTime time4 = time3.clone();
		time4.next();
		
//		5. Sea date5 la fecha 31-Dic-2017.
		DateGrupal date5 = new DateGrupal(31, 12, 2017);
		
//		6. Sea time6 la fecha siguiente de time3 pero su misma hora.
		DateGrupal date6 = time3.toDate();
		date6.next();
		DateTime time6 = new DateTime(time3.getHours(), time3.getMinutes(), time3.getSeconds(),
				                      date6.getDay(),   date6.getMonth(),   date6.getYear());


		
//		7. Imprimir el resultado de comparar time2 y un clon de time2.
		System.out.println(time2.equals(time2.clone()));

//		8. Imprimir el resultado de comparar time3 y date5 en ambos sentidos.
		System.out.println(time3.equals(date5)); // equals de DateTime
		System.out.println(date5.equals(time3)); // equals de Date
		
//		9. Imprimir el resultado de comparar la fecha de time3 y date5.
		System.out.println(time3.toDate().equals(date5));
		
//		10. Añadir los 6 objetos a un arreglo e imprimirlos con los tres formatos.
		DateGrupal[] dates = { time1, time2, time3, time4, date5, date6, time6 };
		for(DateGrupal d : dates) {
			for(int f = 0; f <= 2; f ++) {
				d.setFormat(f);
				// invoca a toString de la clase al que pertenece el objeto
				System.out.println(d); // toString de quién??
			}
		}

	}

}

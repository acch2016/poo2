
// no importa a la clase JOptionPane, solo los metodos showMessageDialog
import static javax.swing.JOptionPane.showMessageDialog;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import com.iteso.calendar.DateGrupal;

import static java.lang.System.out;
import static java.lang.Math.*;
import static com.iteso.calendar.DateGrupal.isLeap;
import static com.iteso.calendar.DateGrupal.isValidDate;

public class Sesion12 {

	public static void main(String[] args) {
		showMessageDialog(null, "Hola mundo");
		out.println("Hola mundo");
		out.println(cos(PI / 2));		
		String nombre = JOptionPane.showInputDialog("¿Nombre?");
		
//		Primer uso de Date (Date.isLeap), se ejecuta el constructor static
		System.out.println(isLeap(3020));  
//		Segundo uso de Date, ya se inicializaron todos los atributos static
		System.out.println(isValidDate(6, 4, 2030));
//		Tercer uso de Date
		System.out.println(DateGrupal.MIN_YEAR);
//		Cuarto uso de Date
		DateGrupal fecha1 = new DateGrupal(31, 7, 3500);
		fecha1.setFormat(2);
		showMessageDialog(null, fecha1);
		
		LocalDate date1 = LocalDate.of(2018, 4, 28);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		LocalDate date3 = date1.plusMonths(4);
		System.out.println(date3);
		
		LocalDate date4 = date2.minusWeeks(5);
		System.out.println(date4);
		
		System.out.println(date3.isBefore(date4));
		System.out.println(date3.isAfter(date4));
		
//		1. Sea d1 la fecha actual
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
//		2. Sea d2 la fecha 23 de septiembre de 2015
		LocalDate d2 = LocalDate.of(2015,9,23);
		System.out.println(d2);
	
//		3. Compara d1 y d2 e imprime la fecha mas antigua.
		if( d1.isAfter(d2) ){
			System.out.println(d1);
		}else if( d1.isBefore(d2)){
			System.out.println(d2);
		}
		
//		4. En una linea de codigo, sum 2 semanas a d1, y restale 4 años
		d1 = d1.plusWeeks(2).minusYears(4);
		System.out.println(d1);
		
//		5. Sea t1 la hora actual
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
//		6. Sea dt1 la fecha-hora creada a partir de la fecha de d2 y la hora de d1
		LocalDateTime dt1 = LocalDateTime.of(d2, t1);
		System.out.println(dt1);
	}

}

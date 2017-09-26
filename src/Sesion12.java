
// no importa a la clase JOptionPane, sólo los métodos showMessageDialog
import static javax.swing.JOptionPane.showMessageDialog;

import java.time.LocalDate;

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
		
	}

}

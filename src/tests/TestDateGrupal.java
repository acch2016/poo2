package tests;

import com.iteso.calendar.DateGrupal;

public class TestDateGrupal {

	public static void main(String[] args) {
		System.out.println(DateGrupal.isLeap(1900));
		System.out.println(DateGrupal.isLeap(2002));
		System.out.println(DateGrupal.isLeap(2012));
		System.out.println(DateGrupal.isLeap(2014));
		System.out.println(DateGrupal.isLeap(2016));
		System.out.println(DateGrupal.isLeap(2018));
		
		DateGrupal today = new DateGrupal();
		System.out.println(today);
		System.out.println(today.isLeap());  // 1-ene-2017
		DateGrupal aDate = new DateGrupal(29, 2, 2016);
		System.out.println(aDate);
		System.out.println(aDate.isLeap());  // 29-feb-2016

		System.out.println(DateGrupal.isValidDate(32,  7, 2016));  // false
		System.out.println(DateGrupal.isValidDate( 5, 13, 2016));  // false
		System.out.println(DateGrupal.isValidDate( 8,  4, 3500));  // false
		System.out.println(DateGrupal.isValidDate(31,  3, 2017));  // true
		System.out.println(DateGrupal.isValidDate(31,  4, 2017));  // false
		System.out.println(DateGrupal.isValidDate(29,  2, 2017));  // false
		System.out.println(DateGrupal.isValidDate(29,  2, 2016));  // true
		System.out.println(DateGrupal.isValidDate(30,  2, 2016));  // false
		System.out.println("---------------");
		DateGrupal d1 = new DateGrupal(30, 4, 2016);
		System.out.println(d1);
		d1.setMonth(2);  // 30-feb-2016 no es válido, se ignora el cambio
		System.out.println(d1);
		
		d1.setDay(28);  //  28-abr-2016
		d1.setMonth(2); //  28-feb-2016
		System.out.println(d1);
		d1.next();      //  29-feb-2016
		System.out.println(d1);
		d1.next();      //   1-mar-2016
		System.out.println(d1);
		
	}

}

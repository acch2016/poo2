package tests;

import com.iteso.calendar.Millis;
import com.iteso.calendar.DateTime;
import com.iteso.calendar.Date;


public class TestMillis {

	public static void main(String[] args) {
		
		// TODO Print 17 not 2017 solved with modulus %100 on toString
		
		Millis m1 = new Millis(); 
		System.out.println(m1);
		// [11:15:48.913] 09/10/17
		
		m1.setFormat(1);
		System.out.println(m1);
		// [11:15:48 AM] 9-Oct-2017 (1507565748913) // TODO   -> now there is only the 6 hours offset
		
		m1.setFormat(2); 
		System.out.println(m1);
		// 9 de octubre de 2017 (1507565748913) // TODO   -> now there is only the 6 hours offset
		
		Millis m2 = new Millis(15, 12, 2017);
		System.out.println(m2);
		// [00:00:00.000] 15/12/17
		
		Millis m3 = new Millis(21, 45, 52, 15, 12, 2017);
		System.out.println(m3);
		// [21:45:52.000] 15/12/17
		
		Millis m4 = new Millis(21, 45, 52, 785, 15, 12, 2017);
		System.out.println(m4);
		// [21:45:52.785] 15/12/17
		
		int ms = m4.getMilliseconds();
		System.out.println("ms = "+ms);
		// ms = 785
		
		long ts = m4.getTimestamp();
		System.out.println("ts = "+ts);
		// ts = 1513395952785
		
		Millis m5 = new Millis(1_307_169_163_000L);
		System.out.println(m5);
		// [01:32:43.090] 04/06/11
		
		m5.setTimestamp(0);
		System.out.println(m5);
		// [18:00:00.000] 31/12/69
		
		m5.setMilliseconds(90);
		System.out.println(m5);
		// [18:00:00.090] 31/12/69
		
		m4.add(Millis.DAY,16);
		System.out.println(m4);
		// [21:45:52.785] 31/12/17
		
		m4.add(Millis.HOUR,2);
		System.out.println(m4);
		// [23:45:52.785] 31/12/17
		
		m4.add(Millis.MINUTE,14);
		System.out.println(m4);
		// [23:59:52.785] 31/12/17
		
		m4.add(Millis.SECOND,7);
		System.out.println(m4);
		// [23:59:59.785] 31/12/17
		
		m4.add(Millis.MILLISECOND, 214);
		System.out.println(m4);
		// [23:59:59.999] 31/12/17
		
		m4.next();
		System.out.println(m4);
		// [00:00:00.000] 01/01/18
		
		System.out.println(m2.isBefore(m3));
		// Imprime true
		
		System.out.println(m3.isBefore(m2));
		// Imprime false
		
		System.out.println(m4.isAfter(m5));
		// Imprime true
		
		System.out.println(m5.isAfter(m4));
		// Imprime false
		
		DateTime dt = new DateTime(20, 53, 17, 4, 10, 2017);
		long timestamp1 = Millis.timestampOf(dt);
		System.out.println(timestamp1);
		 // 1507168397000
		
		Date d = new Date(4, 10, 2017);
		long timestamp2 = Millis.timestampOf(d);
		System.out.println(timestamp2);
		// 1507093200000
		
		m1.add1(Millis.Element.DAY, 5);
//		m1.add1(-6, 8);
	}

}

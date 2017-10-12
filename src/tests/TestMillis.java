package tests;

import com.iteso.calendar.Millis;
public class TestMillis {

	public static void main(String[] args) {
		
		// TODO Print 17 not 2017 solved with modulus %100 on toString
		
		Millis m1 = new Millis(); 
		System.out.println(m1);
		// [11:15:48.913] 09/10/17
		
		m1.setFormat(1);
		System.out.println(m1);
		// [11:15:48 AM] 9-Oct-2017 (1507565748913)
		
		m1.setFormat(2); 
		System.out.println(m1);
		// 9 de octubre de 2017 (1507565748913)
		
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
//		System.out.println(ms);
		// ms = 785
		
		long ts = m4.getTimestamp();
		System.out.println("ts = "+ts);// TODO ts = 1513395952785  -> now there is only the 6 hours offset
//		System.out.println(ts);
		
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
		// [21:45:52.785] 31/12/17
	}

}

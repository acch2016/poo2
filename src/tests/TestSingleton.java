package tests;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.iteso.calendar.DateGrupal;//
import com.iteso.model.Singleton;

public class TestSingleton {

	public static void main(String[] args) {
//		DateGrupal today = new DateGrupal();
//		today.setFormat(2);
//		System.out.println(today);
//		
//		Calendar c1 = Calendar.getInstance();
//		int day   = c1.get(Calendar.DAY_OF_MONTH);
//		int month = c1.get(Calendar.MONTH) + 1;
//		int year  = c1.get(Calendar.YEAR);
//		System.out.println(Calendar.MONTH);
//		System.out.println(Calendar.YEAR);
//		System.out.println(day + "/" + month + "/" + year);
//		
//		JOptionPane.showMessageDialog(null, "Pausa");
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		System.out.println(System.identityHashCode(c1));
//		System.out.println(System.identityHashCode(c2));
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		s1.incX();
		s2.incX();
		System.out.println(s3.getX());
		System.out.println(s2.getX());
		System.out.println(s1.getX());
		
		Singleton.getInstance().incX();
		System.out.println(Singleton.getInstance().getX());
		
		Toolkit   t    = Toolkit.getDefaultToolkit();
		Dimension d    = t.getScreenSize();
		int resolution = t.getScreenResolution();
		System.out.println(d);
		System.out.println(resolution);
		
//		Toolkit es un singleton: t y t2 apuntan al mismo objeto
		Toolkit   t2   = Toolkit.getDefaultToolkit();
		System.out.println(System.identityHashCode(t));
		System.out.println(System.identityHashCode(t2));
	}

}

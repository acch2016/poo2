import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import com.iteso.calendar.DateGrupal;
import com.iteso.model.RGBColor;

public class Sesion25 {

	public static double average(int ... numbers) {
		if(numbers.length == 0) return 0;
		double sum = 0;
		for(int n : numbers) sum += n;
		return sum / numbers.length;
	}
	
	public static double distance(double d, double ... numbers) {
		if(numbers.length == 0) return 0;
		double distance = 0;
		for(double n : numbers) distance += Math.abs(d - n);
		return distance / numbers.length;
	}
	
	static class StringList extends ArrayList<String> {
		@Override
		public int size() {
//			System.out.println("Ahí te va el tamaño: " + super.size());
			return super.size();
		}
	}
	
	public static void main(String[] args) {
		Vector<RGBColor> colorVector = new Vector<RGBColor>();
		colorVector.add(new RGBColor());
		colorVector.add(new RGBColor(255,   0,   0, "Red"));
		colorVector.add(new RGBColor(255,   0, 255, "Magenta"));
		colorVector.add(new RGBColor(  0, 255, 255, "Cyan"));
		colorVector.add(new RGBColor());
		Collections.shuffle(colorVector);
		System.out.println(colorVector);
		Collections.swap(colorVector, 0, 1);
		System.out.println(colorVector);
		int f = Collections.frequency(colorVector, "Gris");
		System.out.println(f);
		f = Collections.frequency(colorVector, new RGBColor());
		System.out.println(f);
		
		Collections.addAll(colorVector, 
				           new RGBColor(150, 200, 50),
				           new RGBColor( 50, 200, 150),
				           new RGBColor(  0, 255, 127));
		System.out.println(colorVector);
		
		LinkedList<Object> objectList = new LinkedList<Object>();
		for(int i = 0; i < colorVector.size(); i ++) objectList.add(null);
//		La lista destino debe tener tantos elementos como la lista origen
		Collections.copy(objectList, colorVector);
//		Collections.copy(colorVector, objectList);
		System.out.println(objectList);
		
		
	}
	
	public static void main2(String[] args) {
		TreeSet<DateGrupal> dateSet = new TreeSet<DateGrupal>();
		dateSet.add(new DateGrupal()); // 13-11-2017
//		Exception in thread "main" java.lang.ClassCastException: 
//		com.iteso.calendar.Date cannot be cast to java.lang.Comparable
		dateSet.add(new DateGrupal(20, 11, 1910));
		dateSet.add(new DateGrupal(25, 12, 2015));
		dateSet.add(new DateGrupal(20, 11, 1910));
		dateSet.add(new DateGrupal(25, 12, 2015));
		System.out.println(dateSet);
		
//		StringList sList = new StringList();
//		sList.add("Hola");
//		sList.add("Adiós");
//		sList.add("Feliz cumpleaños");
//		for(int i = 0; i < sList.size(); i ++) System.out.println(sList.get(i));
		
	}
	
	public static void main1(String[] args) {
		double distance = 0;
		distance = distance(0,  0, 1, 2, 3, 4);
		System.out.println(distance);
		distance = distance(2,  0, 1, 2, 3, 4);
		System.out.println(distance);
		distance = distance(2);
		System.out.println(distance);
		distance = distance(2, -3);
		System.out.println(distance);
		
		double av = 0;
		int[] numbers = {4, 5, 6, 7, 8, 9};
		av = average(numbers);
		System.out.println(av);
		av = average(7, 6, 3, 8, 9, 10, 7);
		System.out.println(av);
		av = average(7);
		System.out.println(av);
		av = average();
		System.out.println(av);
	}

}

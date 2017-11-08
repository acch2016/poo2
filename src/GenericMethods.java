import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Vector;

import com.iteso.calendar.Date;
import com.iteso.calendar.DateTime;
import com.iteso.model.RGBColor;

public class GenericMethods {

	public static void print(List<?> list) {
		for(int i = 0; i < list.size(); i ++) {
			Object element = list.get(i);
			System.out.printf("%d) %s\n", i, element);
		}
		System.out.println("----------");
	}
	
	public static <T> int frequency(Collection<T> collection, T object) {
		int f = 0;
		for(T current : collection) {
			if(current.equals(object)) f ++;
		}
		return f;
	}
	
	public static int greatestInteger(Collection<Integer> collection) {
		int g = Integer.MIN_VALUE;
		collection.add(100_000); // Sí podemos añadir a la colección
		for(Integer current : collection) {
			if(g < current.intValue()) g = current.intValue();
//			if(g < current) g = current;  con auto-unboxing
		}
		return g;
	}
	
	public static double greatestNumber(Collection<? extends Number> collection) {
		double g = Double.NEGATIVE_INFINITY;
//		collection.add(100_000); No podemos añadir a la colección
		for(Number current : collection) {
			if(g < current.doubleValue()) g = current.doubleValue();
		}
		return g;
	}
	
	public static void changeNQueue(Queue<? super Number> dest, Queue<Number> src) {
		Number n = src.poll();
		dest.offer(n);		
	}
	
	public static <T> void changeQueue(Queue<? super T>   dest, 
			                           Queue<? extends T> src) {
//		Object objectInDest = dest.peek();
		T objectInSrc = src.poll();
		dest.offer(objectInSrc);				
	}
	
	public static void main(String[] args) {
		ArrayDeque<Number> numberQueue = new ArrayDeque<Number>();
			numberQueue.offer(100);
			numberQueue.offer(365.5);
			numberQueue.offer(-3.8f);
		ArrayDeque<Object> objectQueue = new ArrayDeque<Object>();
			objectQueue.offer("Hola");
			objectQueue.offer(new DateTime());
		changeQueue(objectQueue, numberQueue);
		System.out.println("Object queue: " + objectQueue);
		System.out.println("Number queue: " + numberQueue);
		changeQueue(numberQueue, numberQueue);
		
		HashSet<Number> numberSet = new HashSet<Number>();
		numberSet.add(-156_678.34);  // double -> Double -> Number
		numberSet.add(-3_500_800L);  // long   -> Long   -> Number
		numberSet.add(-567.85f);     // float  -> Float  -> Number
		System.out.printf("%.3f\n", greatestNumber(numberSet));
		
		Vector<Double> doubleVector = new Vector<Double>();
		doubleVector.add(-123456.78);
		doubleVector.add(123456.78);
		doubleVector.add(0.0);
		System.out.printf("%.3f\n", greatestNumber(doubleVector));
		
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		intQueue.offer(-1500);
		intQueue.offer(-1800);
		intQueue.offer(-900);
		System.out.println(greatestInteger(intQueue));
		System.out.println(greatestNumber(intQueue));
//		changeQueue(intQueue, numberQueue); No válido porque Integer no es más general que Number
		changeQueue(numberQueue, intQueue);
		
		ArrayDeque<Date> dateQueue = new ArrayDeque<>();
			dateQueue.offer(new Date());
			dateQueue.offer(new Date(15, 6, 2017));		
		ArrayDeque<DateTime> timeQueue = new ArrayDeque<>();
			timeQueue.offer(new DateTime());
			timeQueue.offer(new DateTime(23, 56, 35, 15, 6, 2017));
		changeQueue(dateQueue, timeQueue);
//		changeQueue(timeQueue, dateQueue); No válido porque DateTime no es más general que Date
		System.out.println("Date queue: " + dateQueue);
		System.out.println("Time queue: " + timeQueue);
		
		LinkedList<Date> dateList = new LinkedList<Date>(); 
		dateList.add(new Date());
		dateList.add(new Date(25, 12, 2015));
		dateList.add(new Date(16,  9, 1957));
		print(dateList);
		
		ArrayList<RGBColor> colorList = new ArrayList<RGBColor>();
		colorList.add(new RGBColor());
		colorList.add(new RGBColor(250, 150, 120, "Café rojizo"));
		colorList.add(new RGBColor(0, 255, 255, "Cyan"));
		print(colorList);
		
		TreeSet<Byte> byteSet = new TreeSet<Byte>();
		byteSet.add((byte)  50);
		byteSet.add((byte) -20);
		byteSet.add((byte) 110);
//		print(byteSet); Llamada no válida porque TreeSet no implementa a List	
		
		System.out.println(frequency(dateList, new Date()));
		System.out.println(frequency(dateList, new Date(25, 12, 2016)));
//		frequency(dateList, "Navidad"); No válido porque String no es Date (T)
		
		byte b = 50;
		System.out.println(frequency(byteSet, b));  // autoboxing en b
//		frequency(byteSet, 5.6);  No válido porque Double no es Byte
	
		
		
	}

}

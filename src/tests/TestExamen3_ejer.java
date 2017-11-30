package tests;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import com.iteso.calendar.DateGrupal;
import com.iteso.model.RGBColorGrupal;
//import examen.Examen3_ejer;;




public class TestExamen3_ejer {
	
	public static <T extends Comparable<? super T>> int smallers(T object, Collection<T> collection){
		int counter = 0;
		for(T element : collection){
			if( -1==element.compareTo(object)) {
				counter++;
			}
		}
		return counter;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<RGBColorGrupal> colorSet = new LinkedHashSet<RGBColorGrupal>();
		
		colorSet.add(new RGBColorGrupal(255, 0, 0, "Red"));
		int s = colorSet.size();
		System.out.println(s);
		colorSet.add(new RGBColorGrupal(167, 108, 65));
		s = colorSet.size();
		System.out.println(s);
		colorSet.add(new RGBColorGrupal(255, 0, 0, "Red"));
		s = colorSet.size();
		System.out.println(s);
		
		HashMap<String,RGBColorGrupal> colorMap = new HashMap<String,RGBColorGrupal>();
		
		for(RGBColorGrupal element : colorSet){
			colorMap.put(element.getName(),element);
			System.out.println(colorMap.get(element.getName()));
		}
		
		RGBColorGrupal c1 = new RGBColorGrupal();
		c1 = colorMap.get("Blue");
		System.out.println(c1);
		
		Collection<RGBColorGrupal> values = colorMap.values();
		
		System.out.println(values);
		
		int counter = 0;
		for(RGBColorGrupal element : values){
			if( counter == 1 ) {
				RGBColorGrupal c2 = new RGBColorGrupal();
				c2 = element;
				System.out.println(c2);
			}
			counter++;
		}
		
		PriorityQueue<String> stringQueue = new PriorityQueue<String>();
		stringQueue.offer("Alejandro");
		stringQueue.offer("Canale");
		stringQueue.offer("Chombo");
		System.out.println(stringQueue);
		PriorityQueue<String> stringQueue2 = new PriorityQueue<String>();
		stringQueue2.offer("Alejandro2");
//		stringQueue2.offer("Canale2");
//		stringQueue2.offer("Chombo2");
		
		Vector<PriorityQueue<String>> queueVector = new Vector<PriorityQueue<String>>();
//		queueVector.set(0, stringQueue); //incorrecto
		queueVector.add(stringQueue);
		queueVector.add(stringQueue2);
		System.out.println(queueVector);
		
		Stack<Short> st = new Stack<Short>();
//		st.add((short) 32767);//es lo mismo
		st.push((short) 32767);
		st.push((short) 1);
		System.out.println(st);
		
		short sh = st.pop();
		System.out.println(sh);
		
//		swap(List<?> list, int i, int j)
		Collections.swap(queueVector, 0, 1); //ArrayIndexOutOfBoundsException:
		System.out.println(queueVector);
//		Collections.swap( stringQueue, 1, 2);
//		System.out.println(stringQueue);
		
//		copy(List<? super T> dest, List<? extends T> src)
//		copy(List<? super Number> dest, List<? extends Number> src)
		
		HashSet<String> stringSet = new HashSet<String>();
		stringSet.add("uno");
		stringSet.add("dos");
		stringSet.add("tres");
		stringSet.add("cuatro");
		System.out.println(smallers("Hola", stringSet));
//		System.out.println(frequency(dateList, new DateGrupal()));
		
		
		
		
		
 
	}

}








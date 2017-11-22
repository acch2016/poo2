package tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import com.iteso.model.RGBColorGrupal;


public class TestExamen3_ejer {


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
		
		Vector<PriorityQueue<String>> queueVector = new Vector<PriorityQueue<String>>();
//		queueVector.set(0, stringQueue);
		queueVector.add(stringQueue);
		System.out.println(queueVector);
		
		Stack<Short> st = new Stack<Short>();
		st.add((short) 65535);
 
	}

}








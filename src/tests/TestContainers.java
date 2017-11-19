package tests;

import com.iteso.list.NullElementException;
import com.iteso.list.SingleLinkedList;

public class TestContainers {

	public static void main(String[] args) throws NullElementException{
		// TODO Auto-generated method stub
		
		SingleLinkedList<String> list1 = new SingleLinkedList<String>();
		
		list1.add("First");
		list1.add("Second");
		list1.add("Third");
		System.out.println(list1); // Imprime: [First, Second, Third]
		
		for(int i = 0; i < list1.size(); i ++) {
			String element = list1.get(i);
			String ELEMENT = element.toUpperCase();
			list1.set(i, ELEMENT);
			}
		System.out.println(list1); // Imprime: [FIRST, SECOND, THIRD]
		
		SingleLinkedList<String> list2 = list1.clone();
		boolean equals = list1.equals(list2);
		System.out.println(equals); // Imprime: true
		
		String removed = list2.remove(0);
		System.out.println(removed); // Imprime: FIRST
		System.out.println(list2); // Imprime: [SECOND, THIRD]
		equals = list1.equals(list2);
		System.out.println(equals); // Imprime: false
		
//		System.out.println(list1.get(3));
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index must be in the range [0..2]
		
//		list2.set(-1, "Pre-First");
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index must be in the range [0..1]
		
//		list2.remove(2);
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index must be in the range [0..1]
		
//		list2.add(null);
		// Exception in thread "main" com.iteso.containers.NullElementException: Null values are not allowed in add method.
		
		list1.set(1, null);
		// Exception in thread "main" com.iteso.containers.NullElementException: Null values are not allowed in set method.

	}

}

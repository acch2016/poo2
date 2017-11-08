package tests;

import com.iteso.list.SingleLinkedList;

public class TestContainers {

	public static void main(String[] args) {
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
		//boolean equals = list1.equals(list2);
		//System.out.println(equals); // Imprime: true
		
		int t=list2.size();
		System.out.printf("%d\n",t);
//		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i ++) {
			String element = list2.get(i);
			String ELEMENT = element.toLowerCase();
			list2.set(i, ELEMENT);
			}
		//System.out.println(list1); // Imprime: [FIRST, SECOND, THIRD]

	}

}

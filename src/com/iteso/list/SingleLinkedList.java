package com.iteso.list;

public class SingleLinkedList<E> {
	
	
	public class Node{
		
		public Node(E element){
			this.element = element;
		}
		public E element = null;
		public Node next; 
	}
	
	private Node first;
	private Node last;
	private int size;
	
	public SingleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	
	public SingleLinkedList(SingleLinkedList<E>.Node first,SingleLinkedList<E>.Node last, int size) {
//		Node actual = this.first;
//		Node actual2 = this.last;
//		int actual3 = this.size; 
	}

	public void add(E element) {
//		public Node node1 = new Node(); 
		Node node = new Node(element);
		if( 0 == this.size ){
			this.first = node;
			this.last = node;
			node.next = null;
		}
		this.last.next = node;	
		this.last = node;
		node.next = null;
		this.size ++;
		
	}
	
	public String toString() {
		Node actual = this.first;
		String str_node_element = "[" + this.first.element.toString();
		actual = actual.next;
		
		for(int i = 0; i < this.size - 1; i++){
			
			str_node_element = str_node_element + ", " + actual.element.toString();
			actual = actual.next;
		}
		return str_node_element + "]";
	}
	
	public int size() {
//		Node actual = this.first;
		//for(int i = 0; i < ;i++)
		return this.size;
	}
	
	public E get(int indice) {
		Node actual = this.first;
		for(int x = 0; x < indice ; x++){
			actual = actual.next;
		}return actual.element;
	}

	public void set(int indice, E ELEMENT) {
		Node actual = this.first;
		for(int x = 0; x < indice ; x++){
			actual = actual.next;
		}
		actual.element = ELEMENT;
	}
	
	public SingleLinkedList<E> clone() {
		
		SingleLinkedList<E> listcloned = new SingleLinkedList<E>();
//		SingleLinkedList<E> listclone;
		Node actual = this.first;
        while ( actual != null ){
        	listcloned.add( actual.element );
//       	listclone.add( actual.element );
        	actual = actual.next;
        }
//		return new SingleLinkedList<E>(actual,actual2,actual3);
        return listcloned;
	}
	
	public boolean equals(SingleLinkedList<E> list) {
		if(list.size==this.size){
			
			Node actual = this.first;
			 for (;;){
				 
			 }
			
		}return false;
		
	}

}



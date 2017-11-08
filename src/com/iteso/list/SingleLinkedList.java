package com.iteso.list;

public class SingleLinkedList<E> {
	
	
	public class Node{
		
		public Node(E element){
			this.element = element;
		}
		public E element = null;
		public Node next; 
	}
	
	private Node first = null;
	private Node last = null;
	private int size = 0;

	
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

}



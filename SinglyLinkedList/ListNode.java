package SinglyLinkedList;

import java.util.NoSuchElementException;

public class ListNode<T> {
	
	private Node head;
	private Node tail;
	private int size=0;
	public class Node{
		private T data;
		private Node next;
		public Node(T value){
			this.data=value;
			this.next=null;
		}	
		
		public T getData(){
			return data;
		}
	}
	
	public void addFirst(T input){
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next==null){
			tail=head;
		}
	}
	
	public void addLast(T input){
		
		if(size!=0){
			Node newNode = new Node(input);
			tail.next = newNode;
			newNode.next = null;
			size++;
		}else{
			addFirst(input);
		}		
	}
	
	public Node getNode(int index){
		
		if(index>size){
			throw new NoSuchElementException();
		}else{		
			Node tempNode = head;
			for(int i=0; i<index; i++){
				tempNode = tempNode.next;
			}
			
			return tempNode;
		}		
	}
	
	public void addNode(int index, T value){
		
		if(index==0){
			addFirst(value);
		}else if(index==size){
			addLast(value);
		}else{
			Node tempNode = getNode(index-1);
			Node newNode = new Node(value);
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			size++;			
		}
	}
	
	public T deleteNode(int index){
		T value;
		if(index>=size){
			throw new NoSuchElementException();
		}else if(index==0){
			value = head.data;
			head = head.next;
			size--;
		}else if(index==size-1){
			value = tail.data;
			tail = getNode(index-1);
			size--;
		}else{
			Node temp = getNode(index-1);
			value = temp.data;
			temp.next = temp.next.next;
			size--;
		}
		
		return value;
		
	}

}

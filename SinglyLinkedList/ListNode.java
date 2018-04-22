package SinglyLinkedList;

public class ListNode<T> {
	
	private Node head;
	private Node tail;
	private int size=0;
	private class Node{
		private T data;
		private Node next;
		public Node(T value){
			this.data=value;
			this.next=null;
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

}

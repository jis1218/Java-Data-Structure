package Stack;

import java.util.EmptyStackException;

public class ListStack<T> {
	private Node top;
	private int size;
	public ListStack(){
		top = null;
		size=0;
	}
	
	public T getTop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}else{
			return top.getValue();	
		}
					
	}
	
	public void push(T value){
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public T pop(){
		
		if(isEmpty()){
			throw new EmptyStackException();
		}else{
			T value = top.getValue();
			top = top.next;
			size--;
			return value;
		}
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int getSize(){
		return size;
	}
	
	class Node{
		private T value = null;
		private Node next;
		Node(T value){
			this.value = value;
			this.next = null;
		}
		
		public T getValue(){
			return value;
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node tempNode = top;
		String str = "";
		while(tempNode!=null){
			str += tempNode.getValue() + " ";
			tempNode = tempNode.next;
		}
		return str;
	}
	
	
	

}

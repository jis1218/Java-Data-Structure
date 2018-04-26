package Queue;

public class ListQueue<T> {
	
	private Node top;
	private Node bottom;
	private int size;
	
	ListQueue(){
		this.top = null;
		this.bottom = null;
		this.size = 0;
	}
	class Node{
		private T value;
		private Node next;
		Node(T value){
			this.value = value;
			this.next = null;
		}
	}
	
	public void push(T value){
		Node newNode = new Node(value);
		if(size==0){
			bottom = newNode;
			top = bottom;
		}else{
			bottom.next = newNode;
			bottom = newNode;
		}
		size++;
	}
	
	public T pop(){
		T value = top.value;
		top = top.next;
		size--;
		return value;		
	}
	
	public T getTop(){
		return top.value;
	}
	
	

	@Override
	public String toString() {
		String str = "";
		Node temp = top;
		while(temp!=null){
			str += temp.value + "";
			temp = temp.next;
		}		
		return str;
	}
	
	

}

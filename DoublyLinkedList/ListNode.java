package DoublyLinkedList;

public class ListNode<T> {
	private Node head;
	private Node tail;
	private int size=0;
	
	public class Node{
		private T value;
		private Node next;
		private Node prev;
		
		Node(T value){
			this.value = value;
			this.next = null;
			this.prev = null;
		}
		
		public T getData(){
			return value;
		}
	}
	
	public void addFirst(T value){
		Node newNode = new Node(value);
		newNode.next = head;

		if(head!=null){
			head.prev = newNode;
		}		
		head = newNode;
		size++;
		if(head.next==null){
			tail = head;
		}
	}
	
	public void addLast(T value){
		Node newNode = new Node(value);
		if(size!=0){
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}else{
			addFirst(value);
		}
	}
	
	public Node getNode(int index){
		Node temp;
		if(index>=size/2){
			temp = tail;
			for(int i=0; i<size-index; i++){
				temp = tail.prev;
			}
		}else{
			temp = head;
			for(int i=0; i<index; i++){
				temp = head.next;
			}
		}
		
		return temp;		
	}
	
	public void add(int index, T value){
		Node temp = getNode(index-1);
		Node newNode = new Node(value);
		newNode.next = temp.next;
		if(temp.next!=null)
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
		size++;
		
		if(newNode.next==null) tail=newNode;
	}

}

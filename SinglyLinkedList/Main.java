package SinglyLinkedList;

public class Main {
	public static void main(String args[]){
		ListNode<Integer> listNode = new ListNode<>();
		
		listNode.addFirst(3);
		listNode.addNode(1, 5);
		
		System.out.println(listNode.getNode(1).getData());
	}
}

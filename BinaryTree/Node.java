package BinaryTree;

public class Node<Key extends Comparable<Key>>{
	private Key item;
	private Node leftNode;
	private Node rightNode;
	
	public Node(Key item, Node leftNode, Node rightNode){
		this.item = item;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public Key getKey(){ return item;}
	public Node getLeftNode(){ return leftNode;}
	public Node getRightNode(){ return rightNode;}
	
	public void setKey(Key item){this.item=item;}
	public void setLeftNode(Node leftNode){this.leftNode=leftNode;}
	public void setRightNode(Node rightNode){this.rightNode=rightNode;}
}
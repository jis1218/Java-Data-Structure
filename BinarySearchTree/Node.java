package BinarySearchTree;

public class Node {
	private int key;
	private int value;
	private Node leftNode;
	private Node rightNode;
	
	public Node(int key, Node leftNode, Node rightNode){
		this.key = key;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.value = key;
	}
	
	public int getKey(){ return key;}
	public Node getLeftNode(){ return leftNode;}
	public Node getRightNode(){ return rightNode;}
	public int getValue(){ return value;}
	
	public void setKey(int key){
		this.key=key;
		this.value = key;
	}
	public void setLeftNode(Node leftNode){this.leftNode=leftNode;}
	public void setRightNode(Node rightNode){this.rightNode=rightNode;}

}

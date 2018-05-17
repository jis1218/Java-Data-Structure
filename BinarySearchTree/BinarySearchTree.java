package BinarySearchTree;

import BinarySearchTree.Node;
import Queue.ListQueue;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree(){root=null;}
	public Node getRoot(){return root;}
	public void setRoot(Node root){this.root=root;}
	
	public int getValue(int key){
		return getValue(getRoot(), key);
	}
	
	private int getValue(Node n, int key){
		if(n==null){
			System.out.println("no value");
			return 0;
		}
		if(n.getKey()==key){
			System.out.println("Find out");
			return n.getValue();
		}else if(n.getKey()>key){
			System.out.println("On your left");
			return getValue(n.getLeftNode(), key);
		}else{
			System.out.println("On your right");
			return getValue(n.getRightNode(), key);
		}
	}
	
	public void put(int key){
		put(getRoot(), key);
	}
	
	private void put(Node n, int key){
		if(n.getKey()==key){
			n.setKey(key);
		}else if(n.getKey()>key){
			if(n.getLeftNode()==null){
				Node newNode = new Node(key, null, null);
				n.setLeftNode(newNode);
			}else{
				put(n.getLeftNode(), key);
			}
		}else{
			if(n.getRightNode()==null){
				Node newNode = new Node(key, null, null);
				n.setRightNode(newNode);
			}else{
				put(n.getRightNode(), key);
			}
		}
	}
	
	public int min(){
		if(getRoot()==null) return 0;
		return minNode(getRoot()).getKey();	
	}
	
	private Node minNode(Node n){
		if(n.getLeftNode()==null) return n;
		return minNode(n.getLeftNode());
	}
	
	public void deleteMin(){
		if(root==null) System.out.println("empty");
		root = deleteMin(root);
	}
	
	public Node deleteMin(Node n){
		if(n.getLeftNode()==null) return n.getRightNode();
		n.setLeftNode(deleteMin(n.getLeftNode()));
		return n;
	}
	
	public void preorder(Node n){
		if(n!=null){
			System.out.print(n.getKey()+", ");
			preorder(n.getLeftNode());
			preorder(n.getRightNode());
		}
	}
	
	public void inorder(Node n){
		if(n!=null){
			inorder(n.getLeftNode());
			System.out.print(n.getKey()+", ");
			inorder(n.getRightNode());
		}
	}
	
	public void postorder(Node n){
		if(n!=null){
			postorder(n.getLeftNode());			
			postorder(n.getRightNode());
			System.out.print(n.getKey()+", ");
		}
	}
	
	public void levelorder(Node root){
		ListQueue<Node> queue = new ListQueue<>();
		Node t;
		queue.push(root);
		while(!queue.isEmpty()){
			t = queue.pop();
			System.out.println(t.getKey());
			if(t.getLeftNode() != null){
				queue.push(t.getLeftNode());
			}
			if(t.getRightNode() != null){
				queue.push(t.getRightNode());
			}
		}
	}
	
	// size와 height 모두 재귀함수를 이용한다.
	public int size(Node n){
		if(n==null) return 0;
		else return (1+size(n.getLeftNode())+size(n.getRightNode()));
	}
	
	public int height(Node n){
		if(n==null) return 0;
		else return 1+Math.max(height(n.getLeftNode()), height(n.getRightNode()));
	}
	
	public static boolean isEqual(Node n, Node m){
		if(n==null || m==null) return n==m;
		
		if(n.getKey()!=m.getKey()) return false;
		
		return (isEqual(n.getLeftNode(), m.getLeftNode()) && isEqual(n.getRightNode(), m.getRightNode()));
	}

}

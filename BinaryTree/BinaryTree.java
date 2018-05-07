package BinaryTree;
import Queue.ListQueue;

public class BinaryTree<Key extends Comparable<Key>> {
	
	private Node root;
	public BinaryTree(){root=null;}
	public Node getRoot(){return root;}
	public void setRoot(Node root){this.root=root;}
	
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
		
		if(n.getKey().compareTo(m.getKey())!=0) return false;
		
		return (isEqual(n.getLeftNode(), m.getLeftNode()) && isEqual(n.getRightNode(), m.getRightNode()));
	}

}

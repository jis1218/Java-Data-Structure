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

}

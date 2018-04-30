package BinaryTree;


public class Main {
	public static void main(String args[]){
		
		BinaryTree<String> tree = new BinaryTree<>();
		
		Node a = new Node(100, null, null);
		Node b = new Node(200, null, null);
		Node c = new Node(300, null, null);
		Node d = new Node(400, null, null);
		Node e = new Node(500, null, null);
		Node f = new Node(600, null, null);
		
		a.setLeftNode(b);
		a.setRightNode(f);
		b.setLeftNode(c);
		c.setRightNode(d);
		b.setRightNode(e);
		
		tree.setRoot(a);
		//tree.preorder(tree.getRoot());
		//tree.inorder(tree.getRoot());
		tree.levelorder(tree.getRoot());
		
		
	}

}

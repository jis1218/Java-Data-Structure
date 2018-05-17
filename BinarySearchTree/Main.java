package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		int array[] = {3, 4, 6, 8, 12, 34, 67, 68, 87, 100, 102, 106};
		Node root = makeBinaryTree(array, 0, array.length-1);
		BinarySearchTree tree = new BinarySearchTree();
		tree.setRoot(root);
		tree.inorder(tree.getRoot());
		
		tree.getValue(3);
		
		tree.put(15);
		tree.put(4);
		tree.put(93);
		System.out.println(tree.min());
		tree.inorder(tree.getRoot());
		tree.deleteMin();
		tree.deleteMin();
		System.out.println("\n");
		tree.inorder(tree.getRoot());
		

	}
	
	public static Node makeBinaryTree(int array[], int start, int end){
		if(start>end) return null;
		int partition = (start+end+1)/2;
		int value = array[partition];
		Node a = new Node(value, makeBinaryTree(array, start, partition-1), makeBinaryTree(array, partition+1, end));
		return a;		
	}

}

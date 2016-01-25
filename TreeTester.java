package Google;

public class TreeTester {

	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.insertNode(b.root, 10);
		b.insertNode(b.root,5);
		b.insertNode(b.root,2);
		b.insertNode(b.root,15);
		b.insertNode(b.root,14);
		b.preTraverse(b.root);
	
	}

}

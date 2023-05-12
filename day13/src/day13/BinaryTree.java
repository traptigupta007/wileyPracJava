package day13;
class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.item);
	}
	void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.item);

		inOrder(root.right);
	}
	void preOrder(Node root) {
		if(root==null)
			return;
		System.out.println(root.item);
		preOrder(root.left);
		preOrder(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree t=new BinaryTree();
		t.root=new Node(1);
		t.root.left=new Node(12);
		t.root.right=new Node(9);
		t.root.left.left=new Node(5);
		t.root.left.right=new Node(6);
		System.out.println("Inorder traversal");
		t.inOrder(t.root);
		System.out.println("Preorder traversal");
		t.preOrder(t.root);
		System.out.println("Postorder traversal");
		t.postOrder(t.root);
	}

}

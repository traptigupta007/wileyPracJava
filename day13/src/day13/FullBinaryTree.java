package day13;

public class FullBinaryTree {
Node root;
boolean isFullBinaryTree(Node root) {
	if(root==null)
		return true;
	if(root.left==null && root.right==null)
		return true;
	if(root.left!=null && root.right!=null)
		return isFullBinaryTree(root.left)&&isFullBinaryTree(root.right);
	return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullBinaryTree obj=new FullBinaryTree();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.left=new Node(4);
		root.right.right=new Node(5);
		System.out.println(obj.isFullBinaryTree(root));
	}

}

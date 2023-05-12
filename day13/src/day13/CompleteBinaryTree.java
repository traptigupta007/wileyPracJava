package day13;

public class CompleteBinaryTree {
	static int countNodes(Node root) {
		if(root==null)
			return 0;
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	boolean checkComplete(Node root,int ind,int numNodes) {
		if(root==null)
			return true;
		if(ind>=numNodes)
			return false;
		return checkComplete(root.left,2*ind+1,numNodes)&&checkComplete(root.right,2*ind+2,numNodes);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteBinaryTree obj=new CompleteBinaryTree();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println(obj.checkComplete(root,0,countNodes(root)));
	}

}

package day15;
class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val=val;
		left=null;
		right=null;
	}
}
public class LcaBST {
	public static Node lca(Node root, int p,int q) {
		if(root==null)
			return null;
		if(p<root.val && q<root.val)
			return lca(root.left,p,q);
		if(p>root.val && q>root.val)
			return lca(root.right,p,q);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node t=new Node(6);
		t.left=new Node(2);
		t.left.left=new Node(1);
		t.left.right=new Node(4);
		t.left.right.right=new Node(5);
		t.right=new Node(10);
		t.right.left=new Node(8);
		System.out.println(lca(t,5,8).val);
	}

}

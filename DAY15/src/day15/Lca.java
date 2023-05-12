package day15;
public class Lca {
	public static Node lca(Node root, int p,int q) {
		if(root==null)
			return null;
		if(p==root.val || q==root.val)
			return root;
		Node left=lca(root.left,p,q);
		Node right=lca(root.right,p,q);
		if(left!=null && right!=null)
			return root;
		if(left!=null)
			return left;
		return right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node t=new Node(6);
		t.left=new Node(90);
		t.left.left=new Node(11);
		t.left.right=new Node(48);
		t.left.right.right=new Node(15);
		t.right=new Node(12);
		t.right.left=new Node(18);
		System.out.println(lca(t,12,18).val);
	}

}


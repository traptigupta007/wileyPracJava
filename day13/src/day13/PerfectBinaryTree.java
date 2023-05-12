package day13;

public class PerfectBinaryTree {
	static int depth(Node root) {
		Node cur=root;
		int d=0;
		while(cur!=null) {
			d++;
			cur=cur.left;
		}
		return d;
	}
	static boolean isPerfect(int d,int l,Node root) {
	if(root==null)
		return true;
	if(root.left==null && root.right==null)
		return d==l;
	if(root.left==null || root.right==null)
		return false;
	return isPerfect(d,l+1,root.left)&&isPerfect(d,l+1,root.right);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(4);
		root.right.right=new Node(5);
		
		int d=depth(root);
		System.out.println(isPerfect(d,1,root));
	}

}

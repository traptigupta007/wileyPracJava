package day15;

import java.util.*;
import java.util.TreeMap;

public class BottomViewDFS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> h=new TreeMap<>();
//		Queue<Pair> q=new LinkedList<>();
		Node t=new Node(8);
		t.left=new Node(3);
		t.left.left=new Node(1);
		t.left.right=new Node(6);
		t.left.right.left=new Node(4);
		t.right=new Node(10);
		t.right.right=new Node(14);
		t.right.right.left=new Node(13);
		dfs(0,t,h);
		System.out.println(h.values());
	}
	public static void dfs(int lev,Node root,TreeMap<Integer, Integer> h) {
		if(root==null)
			return;
		h.put(lev, root.val);
		dfs(lev-1,root.left,h);
		dfs(lev+1,root.right,h);
		
	}

}

package day15;

import java.util.*;
import java.util.TreeMap;

public class BottomView {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> h=new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();
		Node t=new Node(6);
		t.left=new Node(90);
		t.left.left=new Node(11);
		t.left.right=new Node(48);
		t.left.right.right=new Node(15);
		t.right=new Node(12);
		t.right.left=new Node(18);
		q.add(new Pair(t,0) );
		while(!q.isEmpty()) {
			Pair cur=q.poll();
			int lev=cur.lev;
			h.put(lev,cur.n.val);
			if(cur.n.left!=null)
				q.add(new Pair(cur.n.left,lev-1));
			if(cur.n.right!=null)
				q.add(new Pair(cur.n.right,lev+1));
		}
		System.out.println(h.values());
	}

}

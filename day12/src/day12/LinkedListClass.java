package day12;
public class LinkedListClass {


	Node head;
	static class Node{
		int value;
		Node next;
		public Node(int d) {
			value=d;
			next=null;
		
	}
		

}
	public Node addBegin(Node head1,int val) {
		Node cur=new Node(val);
		cur.next=head1;
		head1=cur;
		return head1;
	}
	public void addEnd(Node head1,int val) {
		Node cur=head1;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=new Node(val);
		
	}
	public void addMiddle(Node head1,int val) {
		Node cur=head1,slow=head1;
		while(cur!=null &&cur.next!=null) {
			cur=cur.next.next;
			slow=slow.next;
		}
		Node next=slow.next;
		slow.next=new Node(val);
		slow.next.next=next;
	}
	public void deleteMiddle(Node head1) {
		Node cur=head1,slow=head1,prev=head1;
		while(cur!=null &&cur.next!=null) {
			cur=cur.next.next;
			prev=slow;
			slow=slow.next;
		}
		
		prev.next=prev.next.next;
	}
	public void deleteEnd(Node head1) {
		Node cur=head1,slow=head1;
		while(cur.next.next!=null) {
			cur=cur.next;
			
		}
		
		cur.next=null;
	}
	public Node deleteStart(Node head1) {
		head1=head1.next;
		return head1;
	}
	public static Node sortFunc(Node head) {
		Node curr=head;
		Node in= null;
		int temp;
		
		if(head==null) {
			return null;
		}else {
			while(curr!=null) {
				in= curr.next;
				while(in!=null) {
					if(curr.value>in.value) {
						temp= curr.value;
						curr.value= in.value;
						in.value= temp;
					}
					in= in.next;
				}
				curr= curr.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListClass linkedList=new LinkedListClass();
		linkedList.head=new Node(1);
		Node sec=new Node(2);
		Node third=new Node(3);
		linkedList.head.next=sec;
		sec.next=third;
		
		linkedList.head=linkedList.addBegin(linkedList.head,7);
		linkedList.addEnd(linkedList.head,6);
		linkedList.addMiddle(linkedList.head,5);

		linkedList.head=linkedList.deleteStart(linkedList.head);
		linkedList.deleteEnd(linkedList.head);
		linkedList.deleteMiddle(linkedList.head);
		linkedList.head=sortFunc(linkedList.head);
		Node cur=linkedList.head;
		while(cur!=null) {
			System.out.println(cur.value);
			cur=cur.next;
		}
	}
}


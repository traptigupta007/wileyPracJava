package day8;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> bq=new LinkedBlockingDeque<>();
		bq.add("hiiii");
		bq.add("b");
		bq.add("jiii");
		bq.add("hagss");
		System.out.println(bq);
Queue<String> aq=new PriorityQueue<>();
aq.add("hiiii");
aq.add("b");
aq.add("cccc");
aq.add("hagss");
System.out.println(aq);
Deque<String> dq=new LinkedList<>();
dq.add("a");
dq.addLast("i");
dq.add("h");
dq.addLast("hi");
dq.removeFirst();
System.out.println(dq);

	}

}

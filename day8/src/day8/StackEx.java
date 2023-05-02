package day8;

import java.util.*;
import java.util.Stack;

public class StackEx {
public static void main(String[] args) {
	Stack<Integer> st=new Stack<>();
	st.push(null);
	st.push(9);
	st.push(10);
	st.push(null);
	st.push(12);
	st.push(null);
	st.push(null);
	System.out.println(st);
	System.out.println("checking empty stack: "+st.isEmpty());
	st.pop();
	System.out.println("after pop element: "+st);
}
}

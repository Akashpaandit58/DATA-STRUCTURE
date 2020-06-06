package com.queue;
import java.util.*;
public class Interleave {
public static void main(String[] args) {
	Queue<Integer>q=new LinkedList<Integer>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	System.out.println(q.peek());
	Stack<Integer>s=new Stack<Integer>();
	int half=q.size()/2;
	for(int i=0;i<half;i++)
	{
		s.push(q.peek());
		q.poll();
		
	}
	while(!s.isEmpty())
	{
		q.add(s.peek());
		s.pop();
	}
	 for (int i = 0; i < half; i++)  
	    { 
	        q.add(q.peek()); 
	        q.poll(); 
	    } 
	  
	    // Again push the first half elements into the stack 
	    // queue: 16 17 18 19 20, stack: 11(T) 12 13 14 15 
	    for (int i = 0; i < half; i++) 
	    { 
	        s.push(q.peek()); 
	        q.poll(); 
	    } 
	    while (!s.empty()) 
	    { 
	        q.add(s.peek()); 
	        s.pop(); 
	        q.add(q.peek()); 
	        q.poll(); 
	    } 
	  System.out.println(q);
}
}

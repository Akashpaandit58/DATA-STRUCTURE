package com.akash.stack;

import java.util.*;



public class Recursiionstack {
	static Stack<Integer>s=new Stack<Integer>();
public static void main(String[] args) {


	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	System.out.println(s.peek());
	reverse();
	 System.out.println("Reversed Stack"); 
     
     System.out.println(s); 
}

private static void reverse() {
	if(s.size()>0)
	{
		int x=s.peek();
		s.pop();
		reverse();
		
		
		insertatbootom(x);
	}

	
}

private static void insertatbootom(int x) {
    if(s.isEmpty())
    	s.push(x);
    else
    {
    	 int a =s.peek();
              s.pop();
              insertatbootom(x);
              
              s.push(a);
    }
}
}

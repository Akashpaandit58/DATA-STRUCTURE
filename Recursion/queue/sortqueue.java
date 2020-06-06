package com.queue;
import java.util.*;
public class sortqueue {
	static Queue<Integer>q=new LinkedList<Integer>();
public static void main(String[] args) {
	q.add(5); 
    q.add(1); 
    q.add(2); 
    q.add(3); 
    q.add(4); 
  
	int n=q.size();
	if(checksorted(n))
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("N0");
	}
	
}

private static boolean checksorted(int n) {
Stack<Integer>s=new Stack<Integer>();
int expected=1;
int ft;
while(q.size()!=0)
{
	ft=q.peek();
	q.poll();
	
	
	if(ft==expected)
	{
		expected++;
	}
	else
		
	{
		if(s.size()==0)
		{
			s.push(ft);
		}
		 else if (s.size() != 0 &&  
                 s.peek() < ft)  
        { 
            return false; 
        } 
		 else
			 s.push(ft);

	}
	   // coming from stack, pop them out. 
    while (s.size() != 0 &&  
           s.peek() == expected)  
    { 
        s.pop(); 
        expected++; 
    } 
}
if (expected - 1 == n &&  
s.size() == 0) 
return true; 

return false; 
}


}


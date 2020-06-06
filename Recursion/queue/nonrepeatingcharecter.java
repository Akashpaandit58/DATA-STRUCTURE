package com.queue;
import java.util.*;
public class nonrepeatingcharecter {
	   final static int MAX_CHAR = 26;
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	while(n-->0)
	{
		int k=sc.nextInt();
		int ar[]=new int[MAX_CHAR];
		Queue<Character>q=new LinkedList<Character>();
		for(int i=0;i<k;i++)
		{char c=sc.next().charAt(0);
			q.add(c);
			ar[c - 'a']++; 
	
		while(!q.isEmpty())
		{
			if(ar[q.peek()-'a']>1)
				q.remove();
			else
			{
				System.out.print(q.peek()+" ");
				break;
			}
		}
		if(q.isEmpty())
		{
			System.out.print(-1+" ");
		}
	}
		System.out.println();
	}
}	
}
		

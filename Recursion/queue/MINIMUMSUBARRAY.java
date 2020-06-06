package com.queue;
import java.util.*;
public class MINIMUMSUBARRAY {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int k=s.nextInt();
	    Deque<Integer>q=new LinkedList<>();
	    int i=0;
	    for(i=0;i<k;i++)
	    {
	        if(arr[i]<0)
	        {
	            q.add(i);
	        }
	    }
	    for(;i<n;i++)
	    {
	    	if(!q.isEmpty())
	    	{
	    		System.out.print(arr[q.peek()]+" ");
	    		
	    	}
	    	else
	    	{
	    		System.out.print(0+" ");
	    	}
	    	while(!q.isEmpty()&&q.peek()<(i-k+1))
	    	{
	    		q.pollFirst();
	    	}
	    	if(arr[i]<0)
	    	{
	    		q.addLast(i);
	    	}
	    	
	    }
	    if(!q.isEmpty())
    	{
    		System.out.print(arr[q.peek()]+" ");
    		
    	}
    	else
    	{
    		System.out.print(0+" ");
    	}
	    System.out.println();


}
}
}
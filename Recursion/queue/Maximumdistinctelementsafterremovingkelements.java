package com.queue;
import java.util.*;
public class Maximumdistinctelementsafterremovingkelements {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	while(n-->0)
	{
		int a=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	count(ar,ar.length,k);
	}
}

private static void count(int[] ar, int length, int k) {
	HashMap<Integer,Integer>h=new HashMap();
	
	PriorityQueue <Integer> p=new PriorityQueue<>(Collections.reverseOrder());
	for(int i =0;i<length;i++)
	{
		if(h.containsKey(ar[i]))
		{
			int val=h.get(ar[i]);
			val++;
			h.remove(ar[i]);
			h.put(ar[i],val);
		}
		else
			h.put(ar[i], 1);
	}
	for(Map.Entry<Integer,Integer>entry:h.entrySet())
	{
		p.add(entry.getValue());
	}
	while(k>0)
	{
		int temp=p.poll();
		temp--;
		if(temp>0)
		
			p.add(temp);
			
		k--;
	} 
	int  res=0;
	while(p.size()!=0)
	{
		p.poll();
		res++;
	}
	System.out.println(res);
}
}

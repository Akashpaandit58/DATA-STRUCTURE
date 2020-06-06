package com.sorting;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Heapsort {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n=sc.nextInt();
    while(n-->0)
    {
      int k=sc.nextInt();
      int f=sc.nextInt();
      int ar[]=new  int[k];
      for(int i=0;i<k;i++)
      {
    	  ar[i]=sc.nextInt();
      }
      
      int size=ar.length;
      sort(ar,size,f);
    }
}

	private static void sort(int[] ar, int size,int f) {
	for(int i=size/2-1;i>=0;i--)
	{
		heapify(ar,size,i);
	}
	for (int i=size-1; i>0; i--) 
    { 
        // Move current root to end 
        int temp = ar[0]; 
        ar[0] = ar[i]; 
        ar[i] = temp; 

        // call max heapify on the reduced heap 
        heapify(ar, i, 0); 
    } 
	for(int j=size-1;j>=size-f;j--)
	{
		System.out.print(ar[j]+" ");
	}
	}

	private static void heapify(int[] ar, int size, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<size&&ar[left]>ar[largest])
		{
			largest=left;
		}
		if(right<size&&ar[right]>ar[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
		  int temp=ar[i];
		  ar[i]=ar[largest];
		  ar[largest]=temp;
		  heapify(ar,size,largest);
		}
	}
}

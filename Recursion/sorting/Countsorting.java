package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Countsorting {
	 public static void main(String args[] ) throws Exception {
	        

	       
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	       Integer[] num = new Integer[n]; 

	    
	        int k=num.length;
	      for(int i=0;i<k;i++)
	        {
	            num[i]=sc.nextInt();

	        }
	        countingsport(num,k);
	    }
	    public static void countingsport(Integer[] num,int k)
	    {
	    	int max=Collections.max(Arrays.asList(num));
	 System.out.println(max);
	 
	 int arrr[]=new int[max+1];
	 for(int i=0;i<=max;i++)
	 {
		 arrr[i]=0;
	 }
	 for(int i=0;i<k;i++)
	 {
		 arrr[num[i]]++;
	 }
/// for printing frequnciez/////
	 	/* for(int j=0;j<=max;j++)
	 {
		 if(arrr[j]>0)
		 {
			 System.out.println(j+" "+arrr[j]);

		
		 }
	 }*/
	 int j=0;
	 int sortedar[]=new int[k];
	 for(int i=0;i<=max;i++)
	 {
		 int tmp=arrr[i];
		 while(tmp-->0)
		 {
			 sortedar[j]=i;
			 j++;
		 }
	 }
	 for(int a:sortedar)
	 {
		 System.out.print(a+" ");
	 }
	    }
	    }
	

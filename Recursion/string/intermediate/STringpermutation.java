package com.string.intermediate;

import java.util.Scanner;

public class STringpermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
 int k=sc.nextInt();
 sc.nextLine();
 while(k-->0)
 {
    				
        String s = sc.nextLine();
       int n=s.length()-1;
  
    
        
         permutation(s,0,n);

 }
     
    }

	private static void permutation(String s,int l,int r) {
	 if(l==r)
	 {
		 System.out.print(s+" ");
	 }
	 else
	 {
		 for(int i=l;i<=r;i++)
		 {
			 s=swap(s,l,i);
			 permutation(s, l+1, r);
			 s=swap(s,l,i);
		 }
	 }
		
	}

	private static String swap(String a, int i, int j) {
	char temp;
	char ab[]=a.toCharArray();
	temp=ab[i];
	ab[i]=ab[j];
	ab[j]=temp;
	
	return String.valueOf(ab);
	}

}

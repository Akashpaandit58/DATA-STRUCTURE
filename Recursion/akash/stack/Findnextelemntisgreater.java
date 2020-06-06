package com.akash.stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Findnextelemntisgreater {
public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-- > 0)
	    {
	        //2147483646 Max int size
	        int n=Integer.parseInt(br.readLine().trim());
	        String s[]=br.readLine().split(" ");
	        long a[]=new long[n];
	        long b[]=new long[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=Long.parseLong(s[i]);
	        }
	
	        Stack<Long> st=new Stack<>();
	        for(int i=n-1;i>=0;i--)
	        {
	        	while(st.isEmpty()==false&&st.peek()<a[i])
	        	{
	        		st.pop();
	        	}
	        	if(st.isEmpty())
	        	{
	        		b[i]=-1;
	        	}
	        	else
	        	{
	        		b[i]=st.peek();
	        	}
	        	st.push(a[i]);
	        }
	        for(long j:b)
	        {
	        	System.out.print(j+" ");
	        }
System.out.println();
}
	   
}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class twostev
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try { 
		    
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    while(n>0)
		    {  
		        int k=sc.nextInt();
		        if(k%10==0)
		  System.out.println(0);
		  else if(k%5==0)
		  System.out.println(1);
		  else
		  System.out.println(-1);
		    }
	}
catch(Exception e) {
		} finally {
         	}
	}
}
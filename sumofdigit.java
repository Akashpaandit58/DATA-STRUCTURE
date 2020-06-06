/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	{
	 try { 
		    
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		
		      while(n>0)
		      {
		          int k=sc.nextInt();
		          int original=k;
                          int rev=0;
                          
                          
		          while(k!=0)
		          {
		              int r=k%10;
		              k=k/10;
		              rev=rev*10+r;
		          }
             if(rev==original)
             System.out.println("wins");
             else
             System.out.println("losses");
		      }
		      
		    
		} catch(Exception e) {
		} finally {
         	}
        }
        }
}

import java.util.*;
import java.lang.*;
import java.io.*;


public class prime {
    	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		while(k>0)
		{
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++)
                    {
                        if(n%i==0)
		    {
		        System.out.println("yes");
		    }
		    else if(n%2==0)
		    {
		        System.out.println("0");
		    }
		    else {
		        System.out.println("no");
		    }
		}
                }
		   
		} catch(Exception e) {
		} finally {
		}
	}
    
}

import java.util.*;
import java.lang.*;
import java.io.*;


public class Totalexpenses {
   public static void main (String[] args) throws java.lang.Exception
	{try {
	    
           Scanner sc=new Scanner (System.in);
       
		int k=sc.nextInt();
                while(k>0)
                {
                    int  qty=sc.nextInt();
                    double price=sc.nextDouble();
                   if(qty>1000)
                   {
                       double cost=(qty*price)-(qty*price*10/100);
                       	System.out.printf("%.6f\n",cost);
                   }
                   else 
                   {
                       System.out.printf("%.6f\n=",qty*price);
                   }
                   k--;
		
	          	}
	    
	   } 
	 catch(Exception e) {
	 } finally {
	 }
    
   
}
}
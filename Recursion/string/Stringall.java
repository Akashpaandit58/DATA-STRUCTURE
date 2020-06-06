package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Stringall {
	
	private static final int MAX_CHAR = 256;
	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);

	 System.out .println("Enter 1 to perform  printing of string");
	 System.out .println("Enter 2 to perform  counting occurence");
	 System.out .println("Enter 3 to perform  removespaces");
	 System.out .println("Enter 4 to find   duplicate char in string" );
	 System.out .println("Enter 5 to reverse");
	 System.out .println("Enter 6 to check String is  anagram or not");
	 System.out .println("Enter 7 to convert string to inetger and reverse");
	 
	 char k=sc.next().charAt(0);
	 sc.nextLine();
	 switch(k)
	 { case '1':System.out.println("Eneter a string");  
		        String s=sc.nextLine();
		        System.out.println(print(s));
		        break;
	 case '2': System.out.println("Eneter a string");  
               String occ=sc.nextLine();
           	     Coutnoccurence(occ);
           	     break;
	 case '3': System.out.println("Eneter a string");  
               String space=sc.nextLine();
               removespaces(space);
               break;
	 case '4':   System.out.println("Eneter a string");  
               String dupli=sc.nextLine();
                   	duplicate(dupli);
                   	break;
	 case '5':  System.out.println("Eneter a string");  
               String rev=sc.nextLine();
               	reverse(rev);
               	break;

	 case '6':   System.out.println("TO check String is anagram or not enter two string value");
	           String s1=sc.nextLine();
	           String s2=sc.nextLine();
	 	         anagram(s1,s2);  
	 	             break;
	 	             
	 case '7': 	  System.out.println("Eneter a string");  
                   String con=sc.nextLine();
	               convert(con);
	               break;
	           
	 case '8': 	  System.out.println("Eneter a string");  
                  String word=sc.nextLine();
                  reverseword(word);
                  break;
	               
	               
	               
	  default :  System.out.println("Wronmg choice");
	 
	 }
	}
	
	private static void reverseword(String word) {
		String s[]=word.split("\\s");
		String rev="";
		for(String s1:s)
		{
			 StringBuilder sb=new StringBuilder(s1);  
		        sb.reverse();  
		        rev+=sb.toString()+" ";
		        
		}
		System.out.println(rev);
		
	}

	private static void convert(String s) {
		int k=Integer.parseInt(s);
		String c=String.valueOf(k);
		System.out.println("After conversion from  String to integer "+ k);

		System.out.println("After conversion from integer to stringX "+ c);
		
	}
	private static void anagram(String s1,String s2)
	{  
      char c1[]=s1.toCharArray();
      char c2[]=s2.toCharArray();
      int n1=c1.length;
      int n2=c2.length;
      
      
      if(n1!=n2)
      {
    	  System.out.println("String cannot be a anagram");
      }
     Arrays.sort(c1);
     Arrays.sort(c2);
     int flag=0;
     for(int i=0;i<n1;i++)
     {	 if(c1[i]==c2[i])
    	 {
    		 flag++;
    	 }
     }
     if(flag>1&&flag==c1.length)
     {
    	 System.out.println("Anagram");
     }
     else 
    	 
     {
    	 System.out.println("Not Anagram");
     }
     
     
		
	}
	private static void reverse(String s) {

 char c[]=s.toCharArray();
 int i =0;
 int j=c.length-1;
 while(i<j)
 {
	 swap(c,i,j);
	 i++;
	 j--;
 }
 System.out.println(Arrays.toString(c));
		
	}
	private static void swap(char[] c, int i, int j) {
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		
	}
	private static void duplicate(String s) {
		char ar[]=s.toCharArray();
		int count=0; 
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
					count++;
					break;
				}
			}
		}
		
	}
	private static void removespaces(String str) {
		   str = str.replaceAll("\\s", ""); 
		   System.out.println(str);
	}
	private static void Coutnoccurence(String str
			) {
		 int count[] = new int[MAX_CHAR]; 
		  
	        int len = str.length(); 
	  
	        // Initialize count array index 
	        for (int i = 0; i < len; i++) 
	            count[str.charAt(i)]++; 
	  
	        // Create an array of given String size 
	        char ch[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
	            ch[i] = str.charAt(i); 
	            int find = 0; 
	            for (int j = 0; j <= i; j++) { 
	  
	                // If any matches found 
	                if (str.charAt(i) == ch[j])  
	                    find++;                 
	            } 
	  
	            if (find == 1)  
	                System.out.println("Number of Occurrence of " + 
	                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
	        } 
	}
	public  static String print(String s)
	{
		return s;
	}
	
	

}

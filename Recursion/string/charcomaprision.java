package com.string;
import java.util.*;
public class charcomaprision {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
 String s=sc.nextLine();
 int count =0;
 char[] ch = s.toCharArray(); 
 for(int i=0;i<ch.length;i++)
 { 
	 for(int j=i+1;j<ch.length;j++)
	 {
		 if(ch[i]==ch[j])
		 {
			 count++;
		 }
	 }
 }
 if(count>0)
 {
	 System.out.println("Yes");
 }
 else
	 System.out.println("No");
}
}

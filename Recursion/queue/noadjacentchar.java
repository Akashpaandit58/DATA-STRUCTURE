package com.queue;
import java.util.*;
public class noadjacentchar {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
sc.nextLine();
while(n-->0)
{
	
String str = sc.nextLine(); 

if (arrange(str.toCharArray())) 
    System.out.println("Yes"); 
else
    System.out.println("No"); 

}
}
private static boolean arrange(char[] str) {
	 Map<Character, Integer> freq = new HashMap<>(); 
	  
   
     int max_freq = 0; 
     for (int j = 0; j < (str.length); j++) { 
         if (freq.containsKey(str[j])) { 
             freq.put(str[j], freq.get(str[j]) + 1); 
             if (freq.get(str[j]) > max_freq) 
                 max_freq = freq.get(str[j]); 
         } 
         else { 
             freq.put(str[j], 1); 
             if (freq.get(str[j]) > max_freq) 
                 max_freq = freq.get(str[j]); 
         } 
     } 
     if (max_freq <= (str.length - max_freq + 1)) 
    	return true;
     else
    	 return false;

}
}

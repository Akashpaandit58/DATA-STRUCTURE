/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Arrays;

public class Stack {
    public static void main(String args[])
    {
        Stackbyarray a=new Stackbyarray( 5);
    
    System.out.println("pushing 6 value in statck");
   for(int i=1;i<=5;i++)
   {
       a.push(i*10);
   }  
   a.push(30);
 System.out.println("Poping 6 values from the Stack...");
		for(int i=1; i<=5; i++) {
			a.pop();
		}
		
    
    }
    
}

package com.akash.stack;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertatlast {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		    //2147483646 Max int size
		        int n=Integer.parseInt(br.readLine());
		 
                Stack<Integer>stack=new Stack<Integer>();
                Stack<Integer>stack1=new Stack<Integer>();
for(int i=0;i<n;i++)
{
	stack.push(Integer.parseInt(br.readLine()));
}

System.out.println("Insert a elemnt which you want to insert at last");
int k=Integer.parseInt(br.readLine());
stack1.push(k);
for(int i=0;i<n;i++)
{
	int d=stack.pop();
	stack1.push(d);
}
System.out.println(stack1.peek());
System .out.println(stack1);
	}
}

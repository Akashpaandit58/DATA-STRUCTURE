package com.akash.stack;
import java.util.*;
public class Infixtoprefix {
public static void main(String[] args) {
	String exp="a+b*c";
	System.out.println(infixToPostfix(exp));
}

private static String infixToPostfix(String exp) {
	
	String result=new String("");
	Stack<Character> s=new Stack<Character>();
	for(int i=0;i<exp.length();i++)
	{
		char c=exp.charAt(i);
	if(Character.isLetterOrDigit(c))
{
	result +=c;
}
	else if(c=='(')
	{
	  s.push(c);
	}
	else if(c==')')
	{
		while(!s.isEmpty() && s.peek()!='(')
			result+=s.pop();
		if (!s.isEmpty() && s.peek() != '(') 
            return "Invalid Expression";
		else
			s.pop();
	
	}
	
	}
	
}
}

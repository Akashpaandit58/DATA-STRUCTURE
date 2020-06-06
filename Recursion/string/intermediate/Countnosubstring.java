package com.string.intermediate;

import java.util.Scanner;

public class Countnosubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a binary sub string");
		String s=sc.nextLine();
		int count =0;
		int count1=0;
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				count++;
			}
			else
			{
				count1++;
			}
			if(count==count1)
			{
				ct++;
			}
		}
		if(count!=count1)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(ct);
		}
	}

	
}

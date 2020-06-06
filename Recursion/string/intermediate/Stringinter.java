package com.string.intermediate;

import java.util.*;

public class Stringinter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
LinkedHashSet<Character>al=new LinkedHashSet<>();
for(int i=0;i<s.length();i++)
{
	al.add(s.charAt(i));
	
}
System.out.println(al);
	

}
	}

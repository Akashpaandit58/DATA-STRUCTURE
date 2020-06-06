package com.string.intermediate;
import java.util.Scanner;
import java.util.stream.*;
public class Subsequence {
public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  String s=sc.nextLine();
  String ans[]=findsubssequnce(s);
 for(int i=0;i<ans.length;i++)
 {
	 System.out.println(ans[i]);
 }
	}

private static String[] findsubssequnce(String s) {
	if(s.length()==0)
	{
		String ans[]={" "};
		return ans;
	}
	
	String  smallans[]=findsubssequnce(s.substring(1));
	String ans[]=new String[2*smallans.length];
	
	for(int i=0;i<smallans.length;i++)
	{
		ans[i]=smallans[i];
	}
	
	for(int i=0;i<smallans.length;i++)
	{ans[i+smallans.length]=s.charAt(0)+smallans[i];
	
	}
	return ans;
	
}

}
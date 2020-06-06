package com.string.intermediate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicatremoval {
	
	public static void main(String[] args) {
	  Scanner sc=new Scanner (System.in);
	  String s=sc.nextLine();
	  StringBuilder sb=new StringBuilder(s);
	  boolean passed =true;
	  while(passed)
	  {
		  passed = false;
          for (int i = 0; i < s.length() - 1; ++i) {

              if (sb.charAt(i) == sb.charAt(i + 1)) {
                  sb.delete(i, i + 2);
                  passed = true;
	  }
          }
	  }
	  if (sb.length() == 0) {
         System.out.println("Empty String");
      } else {
          return sb.toString();
      }
	  
	}
	}

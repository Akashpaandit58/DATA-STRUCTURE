package com.akash.stack;
import java.util.*;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Stackkkkk {
	//for fast input output
	
	 static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader() {
	            br = new BufferedReader(new
	                    InputStreamReader(System.in));
	        }
	 
	        String next() {
	            while (st == null || !st.hasMoreElements()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	 
	        long nextLong() {
	            return Long.parseLong(next());
	        }
	 
	        double nextDouble() {
	            return Double.parseDouble(next());
	        }
	 
	        String nextLine() {
	            String str = "";
	            try {
	                str = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
	
	
public static void main(String[] args) {
	FastReader obj = new FastReader();

    ArrayDeque<Integer> d=new ArrayDeque<Integer>();  
	int n=obj.nextInt();
	for(int i=0;i<n;i++)
	{
		int k=obj.nextInt();
		d.add(k);
	}
	System.out.println("Enter the value to insert in end");
	int insertfisrt=obj.nextInt();
	 d.offerFirst(insertfisrt);   
	 System.out.println("Remoing elemnt from last");
	  int h=d.pollLast();  
	 System.out.println(h);
	 System.out.println(d);
}
}

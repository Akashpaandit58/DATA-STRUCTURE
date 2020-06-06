package com.string.intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Solutuion { 
	public static void main(String[] args) 
	{ 

		int arr[] = {1,2,3}; 
		int k = 3; 
		int n = arr.length; 
		System.out.print(countSubarray(arr, n, k)); 
	} 

	static int countSubarray(int arr[], int n, int k) 
	{ 

	
		int s = 0; 

		int i = 0; 
		while (i < n) { 

			
			if (arr[i] > k) { 
				i++; 
				continue; 
			} 

			
			int count = 0; 
			while (i < n && arr[i] <= k) { 
				i++; 
				count++; 
			} 

			
			s += ((count * (count + 1)) / 2); 
		} 

		return (n * (n + 1) / 2 - s); 
	} 

	
} 



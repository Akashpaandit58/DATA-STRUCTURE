package com.sorting;

public class Quicksort {
public static void main(String[] args) {
	int ar[]={4,3,1,5,2};
	int n=ar.length-1;
	quicksortpartition(ar,0,n);
	System.out.println("sorted array"); 
    printArray(ar); 
}

private static void quicksortpartition(int[] ar, int start, int end) {
	if(start<end)
	{
	int pi=partition(ar,start,end);
	quicksortpartition(ar,start, pi-1);
	quicksortpartition(ar,pi+1,end);
	}
	
	
}

private static int partition(int[] arr, int low, int high) {
 int pivot =arr[high];
 int i = low;
 
 for (int j=low; j<high-1; j++) 
 { 
     // If current element is smaller than the pivot 
     if (arr[j] < pivot) 
     { 
     

         // swap arr[i] and arr[j] 
         int temp = arr[i]; 
         arr[i] = arr[j]; 
         arr[j] = temp; 
         i++;
     } 
 } 
 int temp = arr[i]; 
 arr[i] = arr[high]; 
 arr[high] = temp; 

 return i; 
}
static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i]+" "); 
    System.out.println(); 
} 

}

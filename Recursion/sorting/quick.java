package com.sorting;

public class quick {
	public static void main(String[] args) {
		int ar[]={2,1,3,8,4,5,6,7};
		int n=ar.length-1;
		
		quicksort(ar,0,n);
		System.out.println("sorted array"); 
	    printArray(ar);
	}

	private static void quicksort(int[] ar, int start, int end) {
	if(start<end)
	{
		int pi=quickkk(ar,start,end);
		quicksort(ar, start, pi-1);
		quicksort(ar, pi+1, end);
	}
	}

	private static int quickkk(int[] ar, int low, int end) {
	
int pivot=ar[end];
int i=(low-1);
for( int j=low;j<end;j++)
{

	if(ar[j]<pivot)
	{
		i++;
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
}
int temp=ar[i+1];
ar[i+1]=ar[end];
ar[end]=temp;

return  i+1;

	}
	static void printArray(int arr[]) 
	{ 
	    int n = arr.length; 
	    for (int i=0; i<n; ++i) 
	        System.out.print(arr[i]+" "); 
	    System.out.println(); 
	} 


}

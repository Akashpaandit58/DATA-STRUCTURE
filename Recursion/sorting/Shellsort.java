package com.sorting;

public class Shellsort {
public static void main(String[] args) {
	
	 int ar[]={9,1,0,8,2,5};
	 int n=ar.length;
	shell(ar,n);
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[i]+" ");
	}
}

private static void shell(int[] a, int n) {
	for(int gap=n/2;gap>=1;gap/=2)
	{
		for(int j=gap;j<n;j++)
		{
			for(int i=j-gap;i>=0;i-=gap)
			{
				if(a[i+gap]>a[i])
				{
					break;
				}
				else
				{
			        int temp=a[i+gap];
			        a[i+gap]=a[i];
				     a[i]=temp;
				}
			}
		}
	}
	
}
}

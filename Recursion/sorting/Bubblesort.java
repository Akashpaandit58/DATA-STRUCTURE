package com.sorting;

import java.util.Scanner;

/**
 * @author Akash Pandit
 *
 */
public class Bubblesort {
private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
	int ar[]=new int[6];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}

	System.out.println("Enter 1 to perform buuble sort");
	System.out.println("Enter 2 to perform Selection sort");
	System.out.println("Enter 3 to perform Insertion sort");
	/*System.out.println("Enter 4 to perform Merge sort");
	System.out.println("Enter 5 to perform Quicksort ");*/
	System.out.println("Enter 4 to perfromr Counting sort");
	char ch=sc.next().charAt(0);
switch(ch)
{    case '1': bubble(ar);
                 break;
case '2':     Selectionsort(ar);
                   break;
   
                   
case '3':         Insertionsort(ar);
                    break;
                    
                   
                    
case '4':     Countingsort(ar);
                 break;
  
}
}

private static void Countingsort(int[] ar) {
for(int i=0;i<ar.length;i++)
{
	int max=Math.max(ar[i], ar[i+1]);
}
}

private static void Insertionsort(int[] ar) {
	int temp ;
	int j;
	for(int i=0;i<ar.length;i++)
	{
		temp=ar[i];
		j=i;
		while(j>0&&ar[j-1]>temp)
		{
			ar[j]=ar[j-1];
			j=j-1;
			
		}
		ar[j]=temp;
		
	}
	for(int a:ar)
	{
		System.out.print(a+" ");
	}

	
	
}

private static void Selectionsort(int[] ar) {
int min ;
int temp=0;
for(int i=0;i<ar.length;i++)
{
	min=i;
	for(int j=i+1;j<ar.length;j++)
	{
		if(ar[j]<ar[min])
		{
			min=j;
		}
		
	}
	temp=ar[i];
	ar[i]=ar[min];
	ar[min]=temp;
}

for(int a:ar)
{
	System.out.print(a+" ");
}

	
}

private static void bubble(int[] ar) {
	int temp=0;
	for(int i=0;i<ar.length;i++)
	{
		int flag=0;
		for(int j=0;j<ar.length-1-i;j++)
		{ // if string value is given in array the we will use String compareTo method to  comaparing like if(ar[j].compareToar[j+1]>0) the it will 
		// will return -1,1,0 out of these if it is greater than 0 then swap the string compare to method lexigrphically check the strign
			
			if(ar[j]>ar[j+1])
			{
				temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
		{
			break;
		}
	}
	for(int a:ar)
	{
		System.out.print(a+" ");
	}
	
}
}

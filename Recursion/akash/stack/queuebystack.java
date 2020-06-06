package com.akash.stack;

public class queuebystack {
int arr[]=new int[5];
int arr2[]=new int [5];
int top1=-1;
int top2=-1;
int count=0;

public void enquee(int data)
{
	push(data);
	count++;
}
public void push(int data)
{
	if(top1==arr.length-1)
	{
		System.out.println("Queue is full");
	}
	else
	{
		top1++;
		arr[top1]=data;
	}
	}
public void deque()
{
	if(top1==1&&top2==-2)
	{
		System.out.println("Queue is empty");
	}
	else
	{
		for(int i=0;i<count;i++)
		{
			int a=pop();
			push2(a);
		}
		int b=pop2();
		System.out.println("Popped elemnt is "+b);
		count--;
		for(int i=0;i<count;i++)
		{
		int k=pop2();
		push(k);
		}
	}
}
private void push2(int a) {
	if(top2==arr.length-1)
	{
		System.out.println("Queue is full");
	}
	else
	{
		top2++;
		arr2[top2]=a;
	}
	
}
private int pop2() {
	// TODO Auto-generated method stub
	return arr2[top2--];
}
public int pop() {
	
	return arr[top1--];
}
public void dispaly()
{
	System.out.println("Elements int the list are");
for(int i=0;i<=top1;i++)
{
	System.out.print("["+arr[i]+"]");
	
}
}


}

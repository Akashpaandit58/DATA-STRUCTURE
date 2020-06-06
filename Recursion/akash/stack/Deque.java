package com.akash.stack;

public class Deque {
int rear=-1;
int front=-1;
int arr[]=new int[5];
int k=arr.length;


public void enquefront(int data)
{
	if((front==0&&rear==arr.length-1)||(front==rear+1))
	{
		System.out.println("Queue is full");
	}
	else if(front==-1&&rear==-1)
	{
		front=rear=0;
		arr[front]=data;
	}
	else if(front==0)
	{
		front=arr.length-1;
		arr[front]=data;
	}
	else
	{
		front--;
		arr[front]=data;
	}
}
public void enquerear(int data)
{
	if((front==0&&rear==arr.length-1)||(front==rear+1))
	{
		System.out.println("Queue is full");
	}
	else if(front==-1&&rear==-1)
	{
		front=rear=0;
		arr[rear]=data;
	}
	else if(rear==arr.length-1)
	{
		rear=0;
		arr[rear]=data;
		
	}
	else
	{
		rear++;
		arr[rear]=data;
	}
}
public void dispaly()
{
	int i=front;
	while(i!=rear)
	{
		System.out.println("["+arr[i]+"]");
		i=(i+1)%k;
	}
	System.out.println("["+arr[rear]+"]");
}
public void get()
{
	if(front==-1&& rear==-1)
	{
		System.out.println("Queue is empty");
	}
	else
	{
		System.out.println("Front top  elemnet in queue is"+arr[front]);
		System.out.println("rear top elemnt in a queue  is"+arr[rear]);
	}
}
public void dequefront()
{
	if(front==-1&&rear==-1)
	{
		System.out.println("queue is empty");
	}
	else if(front==rear)
	{
		front=rear=0;
	}
	else if(front==k-1)
	{
		System.out.println("Dequed elemnt from front is "+arr[front]);
		front=0;
	}
	else
	{
		System.out.println("Dequed elemnt from front is "+arr[front]);
		front++;
	}
}
public void dequerear()
{

	if(front==-1&&rear==-1)
	{
		System.out.println("queue is empty");
	}
	else if(front==rear)
	{
		front=rear=0;
	}
	else if(rear==0)
	{
		System.out.println("Dequed elemnt from rear is "+arr[rear]);
		rear=k-1;
	}
	else
	{
		System.out.println("Dequed elemnt from rear is "+arr[rear]);
		rear++;
	}	
}


}

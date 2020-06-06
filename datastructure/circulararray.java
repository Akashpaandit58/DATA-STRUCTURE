package datastructure;

public class circulararray {
static int arr[];
static int rear;int front;
static int size;
	public circulararray(int i)
	{
		this.arr=new int[i];
		rear =0;
		front=0;
		System.out.println("creating a blank circular queue");
	}
 public static void enqueue(int data)
 {if(queueisfull())
 {
	System.out.println("Queue is full"); 
 }
 else
 {
	 arr[rear]=data;
	 rear=(rear+1)%5;
	 size=size+1;
	 
 } 
 }
 private static boolean queueisfull() {
	if(rear==arr.length)
	{
		return true;
	}
	else
	 return false;
}
public int dequeue()
 {
	 int data=arr[front];
	 front =(front+1)%5;
	 size=size+1;
	  return data;
 }
 public void show()
 {
	 System.out.println("Elements are");
	 for(int i=0;i<size;i++)
	 {
		 System.out.println(arr[(front+1%5)]+" ");
	 }
	 System.out.println();
	 for(int n:arr)
	 {
		 System.out.print(n+ " ");
	 }
 }
 

}



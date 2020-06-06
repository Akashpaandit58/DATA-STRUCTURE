package datastructure;

public class Circularqueue {
	int arr[]=new int[5];
	int n=5;
	int rear =-1;
	int front=-1;
	
	public void eneque(int data)
	{
		
		 if(n==rear+1)
		{
			System.out.println("Queue is full");
		}
		 else if(rear==-1&&front==-1)
		{
			front=rear=0;
		     arr[rear]=data;	
		}	
		 else if(rear==n-1)
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
		public void deque()
		{
			if (front==-1&&rear==-1)
			{
				System.out.println("Queue is empty");
			}
			else if(front==rear)
			{
				front=rear=-1;
			}
			else
			{  System.out.println("The Dequed elemnt is "+arr[front]);
				front=(front+1)%n;	
			}
		}
		
		
		public void display()
		{int i=front;
			if (front==-1&&rear==-1)
			{
				System.out.println("Queue is empty");
			}
			else
			{
				System.out.println("Printing queue");
			while(i!=rear)
				{
				System.out.println("["+arr[i]+"]");
					i=(i+1)%n;
					
				}
				
			}
		}
	

}

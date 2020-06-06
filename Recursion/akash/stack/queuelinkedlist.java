package com.akash.stack;

public class queuelinkedlist {
Node rear=null;
Node front =null;
public void enqueu(int data)
{
 Node node=new Node();
 node.data=data;
 node.next=null;
 if( front==null&&rear==null)
 {
	 front=rear=node;
 }
 else
 {
	 rear.next=node;
	rear=node;
 }
 
}
public void display()
{
	Node temp=front;
	while(temp!=null)
	{   System.out.println("["+temp.data+" ]");
		temp=temp.next;
		
	}
	
}
public void dequeu()
{
 Node temp =front;
 front=temp.next;
 System.out.println("Deque elemnt is "+temp.data);
 
}
public void peek()
{
	System.out.println("peek element is ="+front.data);
}

}

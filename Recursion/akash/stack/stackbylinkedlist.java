package com.akash.stack;

public class stackbylinkedlist {
Node top=null;
  public void push(int data)
  {
	  Node node=new Node();
	  node.data=data;
	  node.next=top;
	   top=node;
  }
  
  public void display()
  {
	  Node temp=top;
	  if(top==null)
	  {
		  System.out.println("underflow");
	  }
	  while(temp!=null)
	  {
		  System.out.print(" ["+temp.data+" ]");
		  temp=temp.next;
	  }
	  
  }
  public void peek()
  {
	  int d=top.data;
	 System.out.println("top most elemnt is ="+d);
	 
  }
  public void pop()
  {
	  Node temp=top;
	  if(top==null)
	  {
		  System.out.println("Underflow");
	  }
	  else
	  {
		  System.out.println("popped elemnt is "+top.data);
		  top=top.next;
		  }
  }

}

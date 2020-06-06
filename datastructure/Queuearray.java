package datastructure;

import java.util.Arrays;

public class Queuearray {
int arr[];
int topofqueue;
int begofqueue;
	public Queuearray(int size) {
	this.arr=new int[size];
	this.topofqueue=-1;
	this.begofqueue=-1;
	}
	public void enQueue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue overflow error!!");
		}else if (isQueueEmpty()) { //If the queue is empty then we need to initialize beginning index 
			begofqueue=0;
			topofqueue++;
			arr[topofqueue] = value; 
			System.out.println("Successfully inserted "+value+" in the queue");
		}else { //if the queue already has some elements in it then no need to initialize beginning index
			topofqueue++;
			arr[topofqueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		printQueue();
	}//end of method
	
		
	public void printQueue() {
		if(!isQueueEmpty()) {
			System.out.println("Queue now ...");
			for(int i=begofqueue; i<=topofqueue; i++) {
				System.out.println(arr[i] + "   ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is empty !");
		}
	}
	
	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			System.out.println("Dequeing value from Queue...");
			System.out.println("Dequeued: "+arr[begofqueue]+" from queue");
			begofqueue++;
//		if(begofqueue > topofqueue) { //If last element in the Queue is Dequeued
	//			begofqueue = topofqueue = -1;
			//}
		}
		printQueue();
		System.out.println();
	}//end of method

	
	public boolean isQueueEmpty() {
		if ((begofqueue == -1) || (begofqueue == arr.length))
			return true;
		else
			return false;
	}//end of method

	
	public boolean isQueueFull() {
		if (topofqueue == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
			
	}//end of method

	
	public void peekOperation() {
		if (!isQueueEmpty()) {
			System.out.println(arr[begofqueue]); 
		}else {
			System.out.println("The queue is empty!!");
		}
	}//end of method

	
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue is successfully deleted !");
	}//end of method

}//end of class

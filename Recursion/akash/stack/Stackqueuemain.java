package com.akash.stack;

public class Stackqueuemain {
	public static void main(String[] args) {
		queuebystack qs=new queuebystack();
		qs.enquee(5);
		qs.enquee(2);
		qs.enquee(3);
		
		qs.dispaly();
		qs.deque();
		qs.dispaly();
	}

}

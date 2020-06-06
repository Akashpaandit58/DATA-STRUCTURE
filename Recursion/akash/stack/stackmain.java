package com.akash.stack;

public class stackmain {
	public static void main(String[] args) {
		stackbylinkedlist sl=new stackbylinkedlist();
		sl.push(40);
		sl.push(30);
		sl.push(20);
		sl.display();
		sl.peek();
		sl.pop();
		sl.display();
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Arrays;

/**
 *
 * @author Akash Pandit
 */
class Stackbyarray {
    int arr[];
    int topofstack;

     Stackbyarray(int size)
    {
        this.arr=new int[size];
        this.topofstack=-1;
        System.out.println("Sucessfully created");
    }
     public void push(int i)
     {
         if(isFullStack())
         {
             System.out.println("Stack is full");
             
         }
         else 
         {
            arr[ topofstack+1]=i;
            topofstack++;
            System.out.println("Sucess fully inserted");
                    
         }
         System.out.println(Arrays.toString(arr));
     }
     	public boolean isFullStack() {
		if (topofstack == arr.length-1) {
			System.out.println("Stack is full !");
			return true;
		}else {
			return false;
		}
	}

    void pop() {
        if(stackisEmpty())
        {
            System.out.println("Stack is empty");
        }
       System.out.println("Poping value from Stack: " + arr[topofstack] + "...");
			topofstack--;
    }

    private boolean stackisEmpty() {
    if(topofstack==-1)
    {
        return true;
    }
    else 
        return false;
    }
}

import java.util.*;
public class Stackclass {
     static void push(Stack<Integer> stack)
     {System.out.println("pushing");
         for(int i=0;i<5;i++)
         {
             int y=stack.push(i);
             System.out.print(y+" ");
             
         }
     }
     static void pop(Stack<Integer> stack)
     {try{
         System.out.println("\npop");
         for(int i=0;i<5;i++)
         {
        	 stack.pop();
        	 System.out.print(stack.toString());
         }
     }
     catch(Exception e)
     {
    	 System.out.println("\nStack is empty");
     }
     }
     static void peek(Stack<Integer> stack)
     {
     System.out.println("Peek of the elemnt is");
     int y=stack.peek();
     
     System.out.println("peek is"+y);
     }
     
     static void serach(Stack<Integer> stack,int element)
     {
    	 int pos=stack.search(element);
    	 if(pos==-1)
    	 {
    		 System.out.println("\nElement not found");
    		 
    	 }
    	 else 
    	 {
    		 System.out.println("\nElement found at location "+pos);
    	 }
     }
     
     
     public static void main(String args[])
     {
         Stack<Integer> stack=new Stack();
         push(stack);
         peek(stack);
         pop(stack);
         pop(stack);
         push(stack);
         stack.trimToSize();
         System.out.println("Stack capacity"+stack.capacity());
         serach(stack,2);
     }
}

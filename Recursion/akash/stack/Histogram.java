package com.akash.stack;
import java.util.*;
public class Histogram {
public static void main(String[] args) 
{
	 
	Scanner scn = new Scanner(System.in);
	int k=scn.nextInt();
	while(k-->0)
	{
			
	int n = scn.nextInt();
	Long[] a = new Long[n];
	/* input height of each bar */
	for (int i = 0; i < a.length; i++) {
		a[i] = scn.nextLong();
	}
	System.out.println(solve(a));
	}
}
	

public static long solve(Long[] a) {
	Stack<Integer> stack = new Stack<>();
	long maxArea =Long.MIN_VALUE;
	for (int i = 0; i < a.length;) {
		/* this condition means that as the top element is
		 * smaller than the incoming element, that is why,
		 * it must not be popped and should be given more
		 * time in stack as it can lead to a larger area later.
		 * */
		if (stack.isEmpty() || a[stack.peek()] <= a[i]) {
			stack.push(i);
			i++;
		} else {
			/*As the top of element is greater than the incoming
			 * element, then this top element would no longer be
			 * the smallest element in between 'i' th element and
			 *  previous element, hence, remove this, and calculate
			 *  area corresponding to this element */
			int top = stack.pop();
			if (stack.isEmpty()) {
				/*as no element is left in the stack this means
				 * that this removed top element was the smallest
				 * element in the array till 'i' th index*/
				maxArea = Math.max(maxArea, a[top] * i);
			} else {
				/* area calculation for the removed top as the segment
				 * for this element being the smallest has ended */
				maxArea = Math.max(maxArea, a[top] * (i - stack.peek()-1));
			}
		}
	}

	/* After 'i' has reached the end of the histogram array so
	 * the upper loop will end, but we still have element left to
	 * be processed in the stack, hence do the same process again
	 * until stack becomes empty*/
	while (!stack.isEmpty()) {
		int top = stack.pop();
		if (stack.isEmpty()) {
			/*updating max rectangular area every time*/
			maxArea =  Math.max(maxArea, a[top] * a.length);
		} else {
			maxArea =  Math.max(maxArea, a[top] * (a.length - stack.peek()-1));
		}
	}
	return maxArea;
}

}

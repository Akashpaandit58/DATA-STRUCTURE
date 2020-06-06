import java.util.Scanner;
import java.util.Arrays;


public class Rotationofarray {
    public static void main(String args[])
    {try{Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0)
	{
	    int k=sc.nextInt();
	    int d=sc.nextInt();
	    int arr[]=new int[k];
	    for(int i=0;i<k;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
            int g=arr.length;
      leftrotate(arr,d,g);
   
      n--;
      
          }
    }
    catch(Exception e)
    {
        
    }
        
    }
    public static void leftrotate(int arr[],int d,int g)
            {
           if(d > g)
	            d = d%g;
	
	        int[] tmp = new int[d];
        for(int i = 0; i < d; i++) {
            tmp[i] = arr[i];
	        }
	        for(int i = d; i <g; i++) {
	            arr[i-d] = arr[i];
	        }
	        for(int i = g - d, j = 0; i < g; i++, j++) {
	            arr[i] = tmp[j];
        }
                  for (int i = 0; i < g; i++) 
            System.out.print(arr[i] + " "); 
	    } 
    
    
}




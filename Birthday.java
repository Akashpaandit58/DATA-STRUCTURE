import java.util.Scanner;
public class Birthday {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    
      int j=sc.nextInt();
       int k[]=new int[j];
       for (int i=0;i<=j;i++)
       {
           k[i]=sc.nextInt();
       }
    int d=sc.nextInt();
    int m=sc.nextInt();   
    int n=k.length;
    int b=count(k,d,m,n);

    System.out.println(b);
}

public static int count (int arr[],int m,int d,int n )
{
    int sum = 0;
    int count=0;
        for (int i = 0; i + 1 < m; i++)  
        { 
            // adding the alternate numbers 
            sum = arr[i] + arr[i + 1]; 
       
                  if(sum==d)
                  {
                      count++;
                  }
        
        } 
       
return count;
}
}

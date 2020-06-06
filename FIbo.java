import java.util.Scanner;
public class FIbo {
    
     public static void main(String args[])
    {Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=febo(n);
        System.out.println(k);
    }
     public static int febo(int n)
     {
         if(n==0)
             return 0;
         else if(n==1||n==2)
             return n-1;
         else 
             return febo(n-1)+febo(n-2);
             
     }
}

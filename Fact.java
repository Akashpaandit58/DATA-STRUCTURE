import java.util.Scanner;
public class Fact {
    public static void main(String args[])
    {Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=factorial(n);
        System.out.println(k);
    }
    public static int factorial(int n)
    {      
        if(n==0) 
            return 1;
        else 
            return (n*factorial(n-1));    
    }
    
}


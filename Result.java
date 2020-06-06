import java.util.Scanner;
public class Result {
    public static int getTotal(int a[],int b[])
    { int na=a.length;
    int lcma=a[0];
    for (int i=1;i<na;i++)
        lcma=lcm(lcma,a[i]);
      int nb=b.length;
      int gcdb=b[0];
      for (int i=1;i<nb;i++)
          gcdb=gcd(gcdb,b[i]);
      int count=0;
      int n=0;
      int i=1;
      while(n<gcdb)
      {
          n=lcma*i;
          if(gcdb%n==0)
          {
              count++;
                 ++i;
          }
      }
      return count;
    } 
  static int  lcm(int n1,int n2)
{
   int  maxValue = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( maxValue % n1 == 0 && maxValue % n2 == 0 )
            {
             return maxValue;
            
            }
            ++maxValue;
        }
}
          static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
  } 

          
    public static void main(String args[])
    { Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int [m];
        for(int i=0;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<=m;i++)
        {
            b[i]=sc.nextInt();
        }
        int j=getTotal(a,b);
        System.out.println(j);
                }
            
}

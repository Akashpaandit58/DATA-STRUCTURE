import java.util.Arrays;
import java.util.Scanner;
class house
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b = 0;
               int[] k = null;
        for(int i=0;i<n;i++)
        {  a=sc.nextInt();
           b=sc.nextInt();
            k=new int[a];
          for(int j=0;j<a;j++)
          {
              k[j]=sc.nextInt();
          }
        }

        int g=buy(k,a,b);
        System.out.println(g);
    }
    public static int buy(int k[],int a,int b)
    {
        Arrays.sort(k);
        int sum=0;
        int count=0;
        int n=0;
        for(int i=0;i+1<k.length;i++)
        { sum = k[i] + k[i + 1];
        
            if(sum<=b)
            {
                count++;
            }
            else if(k[i]>b)
            {
                 return 0;
            }
        }
        return (count+1);
    }
}
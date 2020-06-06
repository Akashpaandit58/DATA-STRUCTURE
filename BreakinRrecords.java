import java.util.Scanner;
public class BreakinRrecords {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
    
      int n=sc.nextInt();
       int k[]=new int[n];
       for (int i=0;i<n;i++)
       {
           k[i]=sc.nextInt();
       }
        int b[]=records(k);
        for (int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
    
    }
    public static int[] records(int k[])
    { int highscore=k[0];
    int lowscore=k[0];
    int lowcount=0;
    int highcount=0;
        for(int i=0;i<k.length;i++)
        {
            if(k[i]<lowscore)
            {
                lowscore=k[i];
                lowcount++;
               
            }
            else if(k[i]>highscore)
            {
                highscore=k[i];
                highcount++;
                           }
      
        }
              int j[]={highcount,lowcount};
        return j;
        
        
    }
}

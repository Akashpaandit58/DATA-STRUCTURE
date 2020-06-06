import java.util.Scanner;
public class Mahasena {
    public static void main(String args[])
    {Scanner  sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k[]=new int[n];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<k.length;i++)
        {
        
            k[i]=sc.nextInt();
          if(k[i]%2==0)
          {
              evencount++;
          }
          else 
          {
              oddcount++;
          }
        }
        if(evencount==oddcount)
        {
            System.out.println("NOT READY");
        }
        else if(evencount>oddcount)
        {  
            System.out.println("READY FOR BATTLE");
        }
        else 
        {
              System.out.println("NOT READY");
        }
  
    }
    
}

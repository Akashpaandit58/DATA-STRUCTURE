import java.util.Scanner;
public class Stringeven {
    public static void main(String args[])
    { Scanner sc=new Scanner (System.in);
    
        String s="i am akash";
        String[] a=s.split(" ");
       for(int i=0;i<a.length;i++)
       {
           if(a[i].length()%2==0)
          System.out.println(a[i]);
           
       }
       
    }
    
}

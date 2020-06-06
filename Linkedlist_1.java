import java.util.*;
public class Linkedlist_1
{
    public static void main(String args[])
    {Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      String f;
    List<String> s=new ArrayList();
     
     
    while(n!=0)
       {   s.add(sc.next());
         n--;
       }
    System.out.print("Enetr the value to swap" );
     int k=sc.nextInt();
      int j=sc.nextInt();
      Collections.swap(s,k,j);
    
      System.out.println(s);   
   
                   
    }
}
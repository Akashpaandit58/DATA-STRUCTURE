import java .util.Scanner;
    
public class reverse {
    
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      String original=s;
      String s1 = "";
        char a[]=s.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
         s1=String.valueOf(a[i]);
        }
               if(s1.equals(original))
               {
                   System.out.println("Yes");
           }
               else 
               {
                   System.out.println("No");
                   
               }
        }
    
    }


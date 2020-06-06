import java.util.Scanner;
public class masking {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       String g =s.replaceAll("\\s","");
    StringBuilder sb=new StringBuilder();  

            int count=0;
            for(int i=0;i<s.length();i++)
            {
                    if(String.valueOf(s.charAt(i)).equals(" "))
                    {
                     
                        sb.append(s.charAt(i));
                        count++;
                        continue;
        }
              
                    if(count>0 && count<=3)
                    {
                        sb.append('*');
                        count++;
                        continue;
                    }
                    sb.append(s.charAt(i));
            
         
            }
                        System.out.println(sb);  
                       System.out.println(g);
            }
   
        

         

    }


import java.util.Arrays;
public class Stringdemo {

    public static void main(String args[]) {
     String s="Akash Pandit";
          char[] ch=s.toCharArray();  
          int len=ch.length;
          int value=30;
          String s1=String.valueOf(value);
          
    for(int i=0;i<ch.length;i++)
    {
        System.out.println(ch[i]);
    }
    System.out.println("length of string is :=" +len);
    System.out.println(s1+10);
    }
}

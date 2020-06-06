import java.util.*;
public class Dayofprogrammer {
public static void main(String args[])
{
	
int year=2018;
String k=solution(year);
System.out.println(k);

}
public static String solution(int year)
{
	if(year==1918) {
    return "26.09.1918";
}
else if((year<1918 && year%4==0) ||(year>1918  &&(year%4==0 && year%100 !=0 || year%400==0))) {
    return "12.09." + year;
}
else {
    return "13.09." + year;
}

}

}


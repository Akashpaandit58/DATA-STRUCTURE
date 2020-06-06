package datastructure;
import java.util.*;
public class Findduplicates {

public static void main(String args[])
{
	int arr[]={1,2,3,2,5,6,5,3,9};
HashMap<Integer,Integer> al=new HashMap<>();
for(int a:arr)
{
	if(!al.containsKey(a))
	{
		al.put(a, 1);
	}
	else
	{
		al.put(a,al.get(a)+1);
	}
}
al.equals(2);

for (Map.Entry me :al.entrySet()) 
{
	  System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
}

}
}

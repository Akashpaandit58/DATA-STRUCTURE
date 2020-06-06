package datastructure;

public class binarysearch {
	public static void main(String args[])
	{
int a[]={1,2,3,4,5,6,7,8,9,10};
int srh=6;
int low=0;
int hi=a.length-1;
int mi=(low+hi)/2;
while(low<=hi)
{
if(a[mi]==srh)
{
	System.out.println("elemnt is at" +mi);
	break;
}else if(a[mi]<srh)
	
{
	low=mi+1;
}
else 
{
	hi=mi-1;
}
mi=(low+hi)/2;
}
}
}

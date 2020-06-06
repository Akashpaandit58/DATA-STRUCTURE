package datastructure;

public class circulerqueue {
public static void main(String args[])
{
	circulararray cr=new circulararray(5);
 System.out.println("Enquieng elments in cicular queue");	
 cr.enqueue(10);
 cr.enqueue(50);
 cr.enqueue(60);
 cr.enqueue(30);
 cr.enqueue(12);
 cr.enqueue(44);
 cr.dequeue();
 cr.dequeue();
 cr.show();

}
}

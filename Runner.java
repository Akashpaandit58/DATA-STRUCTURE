

public class Runner {
    public static void main(String args[])
    {

        LinkedList list=new LinkedList();
        list.insert(23);
        list.insert(45);
        list.insert(50);
        list.insertStart(20);
        list.insertAt(3, 34);
        list.insertAt(0,44);
     
        list.getCount();
        list.show();
    }
    
}

package com.akash.tree;
class Node1
{
	int data;

	public Node1(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	} 
	
}
class max
{
	private Node1[] heaparray;
	private int maxsize;
	private int currentsize;
	
	public max(int size) {
		this.maxsize = size;
		currentsize=0;
		heaparray=new Node1[size];
	}
	public int getsize()
	{
		return currentsize;
	}
	public boolean isempty()
	{
		return (currentsize==0);
		
	}
	public boolean insert(int key)
	{
		if(currentsize==maxsize)
			return false;
 
		Node1 node=new Node1(key);
		heaparray[currentsize]=node;
		
		check(currentsize);
		
		currentsize++;
		return true;
		
	}
	public void check(int idx)
	{
		int parent=(idx-1)/2;
		Node1 nodetoinsert=heaparray[idx];
		while(idx>0&&heaparray[parent].getData()<nodetoinsert.getData())
		{
			heaparray[idx]=heaparray[parent];
			idx=parent;
			parent=(parent-1)/2;
		}
		heaparray[idx]=nodetoinsert;
	}
	public Node1 delete()
	{
		Node1 root=heaparray[0];
		currentsize--;
		heaparray[0]=heaparray[currentsize];
		
		
		checkdown(0);
		return root;
		
	}
	private void checkdown(int idx)
	{
		int largechild;
		Node1 top=heaparray[idx];//save the last node top variable
		while (idx<currentsize/2)
		{
			int leftchild=2*idx+1;
			int rightchild=2*idx+2;
			if(rightchild<currentsize && heaparray[leftchild].getData()<heaparray[rightchild].getData())
			{
				largechild=rightchild;
			}
			else
			{
				largechild=rightchild;
			}
			if(top.getData()>=heaparray[largechild].getData())
			{
				//Successfully made the root largest key
				break;
			}
			heaparray[idx]=heaparray[largechild];
			idx=largechild;
		}
		heaparray[idx]=top;
		
	}
	
	public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentsize; m++) {
            if(heaparray[m] != null) {
                System.out.print( heaparray[m].getData() + " ");
            }
            System.out.println();
            
            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item
            
            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentsize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heaparray[j].getData());
                j++;
                if(j == currentsize) {
                    break;
                }
                
                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }
                    
            }
            System.out.println("\n"+dots+dots);
        }
        
        
    }
	
	
}



public class Heap {
public static void main(String[] args) {
	max m=new max(10);
	m.insert(5);
	m.insert(3);
	m.insert(17);
	m.insert(10);
	m.insert(84);
	m.insert(19);
	m.insert(6);
	m.insert(22);
	m.insert(9);
	//System.out.println("After deletion");
	//m.delete();
	m.displayHeap();
}
}

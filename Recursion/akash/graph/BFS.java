package com.akash.graph;
import java.util.*;
public class BFS {
private int V;//(Vertices);
private LinkedList<Integer>[] adj;//taking array for storig items on liked list manner//adjacent list
BFS(int v)
{
	V=v;
	adj=new LinkedList[v];//passing the vertices value so that how many linked list we have to create
	for(int i=0;i<v;i++)
	{
		adj[i]=new LinkedList();//creating for every elment linked list
				
	}
}

public void addedge(int v,int w)
{
	adj[v].add(w);
}
public void bfs(int s)//find bfs from the source given by the user
{
	boolean visited[]=new boolean[V]; // Mark all the vertices as not visited(By default // set as false) 
	LinkedList<Integer> queue=new LinkedList<Integer>();
	visited[s]=true;//Mkaing current node as visited as true
	queue.add(s);//adding the node to the queue
	
	while(queue.size()!=0)
	{
		//Dequeing the elmeny from queue and printing it
		s=queue.poll();
		System.out.println("Dequeing elemnt "+s);
		

        // Get all adjacent vertices of the dequeued vertex s 
        // If a adjacent has not been visited, then mark it 
        // visited and enqueue it 
	Iterator<Integer>ir=adj[s].iterator();
	while(ir.hasNext())
	{
		int n=ir.next();//getiing the next adjacent list node
		if(!visited[n])
		{
			visited[n]=true;
			queue.add(n);
		}
	}
	
	
	}
	
}
public void dfs(int s)
{
	boolean visited[]=new boolean[V];
	Stack<Integer> stack=new Stack<Integer>();
	visited[s]=true;
	stack.add(s);
	
	
	while(stack.size()!=0)
	{
		s=stack.pop();
		System.out.println("Popping elments are ====>"+s);
		
		
		Iterator<Integer>i=adj[s].iterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!visited[n])
			{
				visited[n]=true;
				stack.add(n);
			}
		}
	}
	
}


public static void main(String[] args) {
	BFS g=new BFS(5);

    g.addedge(0, 1); 
    g.addedge(0, 2); 
    g.addedge(1, 2); 
    g.addedge(2, 0); 
    g.addedge(2, 3); 
    g.addedge(3, 3);
    System.out.println("Following is Breadth First Traversal"); 

         g.bfs(1); 
         
         System.out.println("Following is Breadth First Traversal");
         g.dfs(2);
         
         

}
}

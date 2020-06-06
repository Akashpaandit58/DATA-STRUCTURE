package com.akash.tree;
import java.util.Scanner;
class Node
{
	int data;
	Node right;
	Node left;
	
}
class Bst
{
	 static final int  count=10;
	public Node insert(Node node, int i) {
		if(node==null)
		{
			return createnewnode(i);
		}
		else if(i<node.data)
		{node.left=insert(node.left,i);
		
		}
		else if(i>node.data)
		{
			node.right=insert(node.right,i);
		}
		return node;
	}

	private Node createnewnode(int i) {
	   Node node=new Node();
			node.data=i;
	   node.right=null;
	   node.left=null;
		return node;
	}
	public static Node deleteNode(Node root, int key)
	{
		// base case: key not found in tree
		if (root == null) {
			return root;
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		}
		
		// if given key is more than the root node, recur for right subtree
		else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		}

		// key found
		else
		{
			// Case 1: node to be deleted has no children (it is a leaf node)
			if (root.left == null && root.right == null)
			{
				// update root to null
				return null;
			}

			// Case 2: node to be deleted has two children
			else if (root.left != null && root.right != null)
			{
				// find its in-order predecessor node
				Node predecessor = maximumKey(root.left);

				// Copy the value of predecessor to current node
				root.data = predecessor.data;

				// recursively delete the predecessor. Note that the
				// predecessor will have at-most one child (left child)
				root.left = deleteNode(root.left, predecessor.data);
			}

			// Case 3: node to be deleted has only one child
			else
			{
				// find child node
				Node child = (root.left != null)? root.left: root.right;
				root = child;
			}
		}

		return root;
	}
	// Helper function to find maximum value node in subtree rooted at ptr
		public static Node maximumKey(Node ptr)
		{
			while (ptr.right != null) {
				ptr = ptr.right;
			}

			return ptr;
		}


	public void inorder(Node node) {

	    if(node == null) { 
	      return;
	    }
	    
	    inorder(node.left);
	  
	    System.out.print("["+node.data + " ]");
	    inorder(node.right);
	  }
	public void preorder(Node node)
	{
		if(node==null)
		{
			return;
		}
	    System.out.print("["+node.data + " ]");
	    inorder(node.left);
	    inorder(node.right);
	    
	}
	
	
	public boolean search(Node node,int data)
	{if(node==null)
	{
		return false;
		
	}
	boolean ispresent=true;
	while(node!=null)
	{
		if(data<node.data)
		{
			node=node.left;
		}
		else if(data>node.data)
		{
			node=node.right;
		}
		else
		{
			ispresent=true;
			break;
		}
	}
		return ispresent;
	}
	static void dispaly(Node root,int space)
	{
		if(root==null)
			return;
		space+=count;
		dispaly(root.right,space);
		System.out.print("\n");
		for(int i=count;i<space;i++)
			System.out.print(" ");
		System.out.print(root.data + "\n");
		
	dispaly(root.left, space);	
	
	  
}
	static void display2D(Node root)  
	{  
	    // Pass initial space count as 0  
	    dispaly(root, 0);  
	}
}
	




public class Binarytree {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	
          Bst b=new Bst();
          Node root=null;
          int keys[]=new int[10];
          for(int i=0;i<10;i++)  
          {  
          System.out.println("Enter value to be inserted");  
              keys[i]=sc.nextInt(); 
              root = b.insert(root, keys[i]);  
          }  
		  System.out.println("Inorder trversal");
          b.inorder(root);
          System.out.println("\nPreorder trversal");
          b.preorder(root);
          
          root=Bst.deleteNode(root,3);
          System.out.println();
          b.inorder(root);
          System.out.println("Is present or not True or false===="+b.search(root, 4));
	
             b.display2D(root);
          
	}
}

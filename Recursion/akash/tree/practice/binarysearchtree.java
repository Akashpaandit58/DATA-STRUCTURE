package com.akash.tree.practice;
import java.util.*;
public class binarysearchtree {
	class Node
	{
		Node right;
	   Node left;
	   int key;
	   public Node(int data)
	   {
		   key=data;
		   right=left=null;
	   }
	}
Node root;
//Constructor
binarysearchtree()
{
	root=null;
}
void insert(int key)
{
	root=insertrec(root,key);
}
Node insertrec(Node root,int key)
{
	if(root==null)
		{root=new Node(key);
	return root;
		}
	if(key<root.key)
		root.left=insertrec(root.left, key);
	else if(key>root.key)
		root.right=insertrec(root.right,key);
	
	return root;
		
		
}
public Node search(Node root,int data)
{ 
	Node temp=root;
	System.out.println("Visting element: ");
	while(temp.key!=data)
	{
		if(temp!=null)
		{
			System.out.println(temp.key+" ");
		if(data<temp.key)
			temp=temp.left;
		else
			temp=temp.right;
		
		if(temp==null)
			temp=null;
	}
	}
	return temp;
	
}
public void serachh(int data)
{
  root = search(root,data);
}

void deletekey(int key)
{
	root=deleteRec(root,key);
}Node deleteRec(Node root, int key) 
{ 
    /* Base Case: If the tree is empty */
    if (root == null)  return root; 

    /* Otherwise, recur down the tree */
    if (key < root.key) 
        root.left = deleteRec(root.left, key); 
    else if (key > root.key) 
        root.right = deleteRec(root.right, key); 

    // if key is same as root's key, then This is the node 
    // to be deleted 
    else
    { 
        // node with only one child or no child 
        if (root.left == null) 
            return root.right; 
        else if (root.right == null) 
            return root.left; 

        // node with two children: Get the inorder successor (smallest 
        // in the right subtree) 
        root.key = minValue(root.right); 

        // Delete the inorder successor 
        root.right = deleteRec(root.right, root.key); 
    } 

    return root; 
} 


private int minValue(Node root) {
	int minval=root.key;
	while(root.left!=null)
	{
		minval=root.left.key;
		root=root.left;
	}
	return minval;
}
void inorder()  { 
    inorderRec(root); 
 } 
void inorderRec(Node root) { 
    if (root != null) { 
        inorderRec(root.left); 
        System.out.println(root.key); 
        inorderRec(root.right); 
    } 
} 
void  printlevelorder()
{
	Queue<Node>q=new LinkedList<Node>();
	q.add(root);
	while(!q.isEmpty())
	{
		Node temp=q.poll();
		System.out.println(temp.key+" ");
		if(temp.left!=null)
			q.add(temp.left);
		if(temp.right!=null)
			q.add(temp.right);
	}
	
}

public static void main(String[] args) {
         binarysearchtree b=new binarysearchtree();
         
         b.insert(50);
         b.insert(30);
         b.insert(20);
         b.insert(40);
          b.insert(70);
          b.insert(80);
        b.deletekey(20);
         b.inorder();
         System.out.println("levelorder traversal");
         b.printlevelorder();
       
}
}

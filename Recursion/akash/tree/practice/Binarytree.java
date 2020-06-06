package com.akash.tree.practice;

import java.util.*;
public class Binarytree {
public static void main(String[] args) {
	Node root=new Node(10);
	root.left=new Node(5);
	root.left.left=new Node(1);
			
	root.right=new Node(3);
	root.right.right=new Node(4);
 System.out.println("Inorder traversal  is ");
inorder(root);
System.out.println();
System.out.println("Pre-Order traversal");
preorder(root);
System.out.println();

System.out.println("Postorder travesal");
postorder(root);
System.out.println();
System.out.println("Level order travesal");
levelordertravesal(root);
System.out.println();
System.out.println("Height of the tree is "+height(root));
aklevel(root,1);
int height=0;
if(IsBSt(root))
{
	System.out.println("true");
}
else 
{
	System.out.print("false");
}
if(balanced(root,height)==true)
{
	System.out.println("True");
}
else 
	System.out.println("False");
}

static void inorder(Node root)
{
	if(root==null)
		return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}

static void preorder(Node root)
{
	if(root==null)
		return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
	
}
static void postorder(Node root)
{
	if(root==null)
		return;
	inorder(root.left);

	inorder(root.right);
	System.out.print(root.data+" ");

	
}
static void levelordertravesal(Node root)
{
	Queue<Node>q=new LinkedList<Node>();
     q.add(root);
     while(!q.isEmpty())
     {
    	 Node x=q.poll();
    	 System.out.print(x.data+" ");
    	 if(x.left!=null)
    	 {
    		 q.add(x.left);
    	 }
    	 if(x.right!=null)
    	 {
    		 q.add(x.right);
    	 }
     }
}
static int height(Node root)
{
	if(root==null)
		return 0;
	int lh=height(root.left); 
	int rh=height(root.right);
	return Math.max(lh, rh)+1;

}
static boolean balanced(Node root,int height)
{
	if(root==null)
	{	height=0;
	return  true;
}
	int lh=0;int rh=0;
	boolean lb=balanced(root.left,lh);
	boolean rb=balanced(root.right,rh);
	if(Math.abs(lh-rh)>1)
	{
		return false;
	}
	height=Math.max(lh,rh)+1;
	return (lb&&rb);
		
			
}
static void aklevel(Node root,int k)

{
	if(root==null)
		return;
	if(k==0)
	{
		System.out.print("levels "+root.data);
		
	}
	aklevel(root.left,k-1);
	aklevel(root.right,k-1);
}
public static boolean isbst(Node root,int min,int max)
{
	if(root==null)
		return true;
	if(root.data<min||root.data>max)
		return false;
	return isbst(root.left,min,root.data)&&isbst(root.right,root.data,max);
}
public static boolean IsBSt(Node root)
{
	return isbst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
}
class Node
{
	int data;
	Node right;
	Node left;
	Node(int x)
	{
		data=x;
	}
}

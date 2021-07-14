package com.dit.dsa.tree;

public class MNode {
	
	int data;
	MNode left, right;
	
	MNode(int data, MNode left, MNode right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	static MNode newNode(int data)
	{
		return new MNode(data, null, null);
	}
	
	static MNode mergeTrees(MNode t1, MNode t2)
	{
		if(t1 == null)
		{
			return t2;
		}
		if(t2 == null)
		{
			return t1;
		}
		
		t1.data += t2.data; // if overlap then sum up the nodes
		
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		
		return t1;
	}
	
	static void inOrder(MNode node)
	{
		if(node == null)
		{
			return;
		}
		
		inOrder(node.left);
		
		System.out.print(node.data+" ");
		
		inOrder(node.right);
		
	}
	
	public static void main(String[] args) {
	
		//first binary tree
		
		MNode root1 = newNode(1);
		root1.left = newNode(2);
		root1.right = newNode(3);
		root1.left.left = newNode(4);
		root1.left.right = newNode(5);
		root1.right.right = newNode(6);

		//second binary tree
		
		MNode root2 = newNode(4);
		root2.left = newNode(1);
		root2.right = newNode(7);
		root2.left.left = newNode(3);
		root2.left.right = newNode(2);
		root2.right.right = newNode(6);
		
		MNode root3 = mergeTrees(root1, root2);
		System.out.println("Merge Tree is ");
		inOrder(root3);
				
	}
}

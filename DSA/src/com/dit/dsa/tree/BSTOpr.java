package com.dit.dsa.tree;

public class BSTOpr {
	
	class Node {
		
		int data;
		Node left, right;
		
		Node(int data)
		{
			this.data = data;
			left = right = null;
		}	
	}
	
	Node root;
	
	BSTOpr()
	{
		root = null;
	}
	
	void insert(int data)
	{
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		}
		else if(data > root.data) {
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	Node search(int data)
	{
		return searchRec(root, data);
	}
	
	public Node searchRec(Node root, int data)
	{
		if(root == null || root.data == data)
		{
			System.out.println("Node is found "+data);
			return root;
		}
		
		if(root.data < data)
		{
			return searchRec(root.right, data); // data is greater
		}
		else {
			return searchRec(root.left, data); // data is smaller
		}
	}
	
	void delete(int data)
	{
		root = deleteRec(root, data);
	}
	

	Node deleteRec(Node root, int data)
	{
		if(root == null)
		{
			return root;
		}
		
		if(root.data > data)
		{
			root.left = deleteRec(root.left, data);
		}
		else if(root.data < data)
		{
			root.right = deleteRec(root.right, data);
		}
		else {
			//node with only one child
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			
			//node with 2 children, inorder successor(smallest value in the right subtree)
			
			root.data = minValue(root.right);
			
			//delete the inorder successor
			root.right = deleteRec(root.right, root.data);
			
		}
		
		return root;
	}
	
	int minValue(Node root)
	{
		int min = root.data;
		
		while(root.left != null)
		{
			min = root.left.data;
			root = root.left;
		}
		
		return min;
	}
	
	void inOrder()
	{
		inOrderRec(root);
	}
	
	void inOrderRec(Node root)
	{
		if(root != null)
		{
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		
		BSTOpr tree = new BSTOpr();
		
		tree.insert(20);
		tree.insert(40);
		tree.insert(30);
		tree.insert(60);
		tree.insert(10);
		
		tree.inOrder();
		
		tree.delete(60);
		System.out.println();
		
		tree.inOrder();
		
		System.out.println();
		
		tree.search(30);
		
	}
}

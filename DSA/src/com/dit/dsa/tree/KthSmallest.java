package com.dit.dsa.tree;

class KthNode {
	
	int data;
	KthNode left, right;
	
	KthNode(int data)
	{
		this.data = data;
		left = right = null;
	}	
}

public class KthSmallest {
	
	static int count = 0;
	
	public static KthNode insert(KthNode root, int data)
	{
		if(root == null)
		{
			return new KthNode(data);
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data)
		{
			root.right = insert(root.right, data);
		}
		
		return root;
	}
	
	public static KthNode kthSmallest(KthNode root, int k)
	{
		if(root == null)
		{
			return null;
		}
		
		//search in left subtree
		KthNode left = kthSmallest(root.left, k);
		
		if(left != null)
		{
			return left;
		}
		
		count++;
		
		if(count == k)
		{
			return root;
		}
		
		// search in right subtree
		return kthSmallest(root.right, k);
		
	}
	
	public static void printKthSmallest(KthNode root, int k)
	{
		count = 0;
		
		KthNode result = kthSmallest(root, k);
		
		if(result == null)
		{
			System.out.println("Not found");
		}
		
		else {
			System.out.println("Kth Smallest Element is "+result.data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KthNode root = null;
		int keys[] = {20, 8, 22, 4, 12, 10, 14};
		
		for(int i : keys)
		{
			root = insert(root, i);
		}
		
		int k = 3;
		printKthSmallest(root, k);
		
	}

}

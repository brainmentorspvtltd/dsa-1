package com.dit.dsa.tree;

class TreeNode {
	int key;
	TreeNode left, right;
	
	TreeNode(int key)
	{
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreeTraversals {
	
	TreeNode root;
	
	BinaryTreeTraversals()
	{
		root = null;
	}
	
	void printInorder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		printInorder(node.left);
		
		System.out.print(node.key+" ");
		
		printInorder(node.right);
	}
	
	void printPreorder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		System.out.print(node.key+" ");
		
		printPreorder(node.left);
		
		printPreorder(node.right);
	}
	
	void printPostorder(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		
		printPostorder(node.left);
		
		printPostorder(node.right);
		
		System.out.print(node.key+" ");
	}
	
	void printInorder()
	{
		printInorder(root);
	}
	
	void printPreorder()
	{
		printPreorder(root);
	}
	
	void printPostorder()
	{
		printPostorder(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeTraversals tree = new BinaryTreeTraversals();
		
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		System.out.println("Inorder Traversal of a Binary Tree ");
		tree.printInorder();
		
		System.out.println("\nPreorder Traversal of a Binary Tree ");
		tree.printPreorder();
		
		System.out.println("\nPostorder Traversal of a Binary Tree ");
		tree.printPostorder();
	}

}

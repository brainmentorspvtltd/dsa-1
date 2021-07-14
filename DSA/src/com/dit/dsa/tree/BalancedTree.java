package com.dit.dsa.tree;

class TNode {
	int data;
	TNode left;
	TNode right;
	
	TNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class BalancedTree {
	
	TNode root;
	
	int height(TNode node)
	{
		//if tree is empty
		if(node == null)
		{
			return 0;
		}
		
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	boolean checkBalanced(TNode node)
	{
		//if tree is empty
		if(node == null)
		{
			return true;
		}
		
		int lh; // height of left subtree
		int rh; // height of right subtree
		
		lh = height(node.left);
		rh = height(node.right);
		
		if(Math.abs(lh - rh) <= 1 && checkBalanced(node.left) && checkBalanced(node.right)) {
			
			return true; // height is balanced
		}
		
		return false; // height is not balanced
	}
	
	public static void main(String[] args) {
	
		BalancedTree tree = new BalancedTree();
		
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.left.right = new TNode(5);
		tree.root.left.left.left = new TNode(6);
		
		if(tree.checkBalanced(tree.root))
		{
			System.out.println("Tree is Balanced");
		}
		else {
			System.out.println("Tree is not Balanced");
		}
		
	}
}

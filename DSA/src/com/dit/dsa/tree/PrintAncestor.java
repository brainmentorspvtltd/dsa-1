package com.dit.dsa.tree;

class PNode {
	int data;
	PNode left, right;
	
	public PNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class PrintAncestor {
	
	PNode root;
	
	boolean printAncestors(PNode node, int target)
	{
		if(node == null)
		{
			return false;
		}
		
		if(node.data == target)
		{
			return true;
		}
		
		if(printAncestors(node.left, target) || printAncestors(node.right, target))
		{
			System.out.print(node.data+" ");
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		PrintAncestor tree = new PrintAncestor();
		
		tree.root = new PNode(1);
		tree.root.left = new PNode(2);
		tree.root.right = new PNode(3);
		tree.root.left.left = new PNode(4);
		tree.root.left.right = new PNode(5);
		tree.root.left.left.left = new PNode(7);
		
		tree.printAncestors(tree.root, 7);
	}
}

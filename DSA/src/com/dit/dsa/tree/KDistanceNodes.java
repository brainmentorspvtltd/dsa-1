package com.dit.dsa.tree;

class KNode {
	int data;
	KNode left, right;
	
	public KNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


public class KDistanceNodes {
	
	KNode root;
	
	void printKDistance(KNode node, int k)
	{
		if(node == null || k < 0)
		{
			return;
		}
		
		if(k == 0)
		{
			System.out.print(node.data+" ");
			return;
		}
		
		//recursively printing or traversing the tree
		printKDistance(node.left, k - 1);
		printKDistance(node.right, k - 1);
		
	}
	
	public static void main(String[] args) {
	
		KDistanceNodes tree = new KDistanceNodes();
		
		tree.root = new KNode(1);
		tree.root.left = new KNode(2);
		tree.root.right = new KNode(3);
		tree.root.left.left = new KNode(4);
		tree.root.left.right = new KNode(5);
		tree.root.right.left = new KNode(8);
		
		tree.printKDistance(tree.root, 2);
	}
}

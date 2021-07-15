package com.dit.dsa.tree;

class FCNode {
	
	int data;
	FCNode left, right;
	
	FCNode(int data)
	{
		this.data = data;
		left = right = null;
	}	
}


public class FCTree {
	
	FCNode root;
	int floor;
	int ceil;
	
	public void floorCeilBST(FCNode root, int data)
	{
		floor = -1;
		ceil = -1;
		
		floorCeilBSTHelper(root, data);
		
		System.out.println(data+" floor "+floor+" Ceil "+ceil);
	}

	public void floorCeilBSTHelper(FCNode root, int data)
	{
		while(root != null)
		{
			if(root.data == data)
			{
				ceil = root.data;
				floor = root.data;
				return;
			}
			if(data > root.data) {
				
				floor = root.data;
				root = root.right;
			}
			else {
				ceil = root.data;
				root = root.left;
			}
		}
		
		return;
	}
	
	public static void main(String[] args) {
		
		FCTree tree = new FCTree();
		
		tree.root = new FCNode(8);
		tree.root.left = new FCNode(4);
		tree.root.right = new FCNode(12);
		tree.root.left.left = new FCNode(2);
		tree.root.left.right = new FCNode(6);
		tree.root.right.left = new FCNode(10);
		tree.root.right.right = new FCNode(14);
		
		tree.floorCeilBST(tree.root, 6);
		
		tree.floorCeilBST(tree.root, 11);
		
		tree.floorCeilBST(tree.root, 1);
		
	}
}

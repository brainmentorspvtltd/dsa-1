package com.dit.dsa.tree;


class LCANode {
	
	int data;
	LCANode left, right;
	
	LCANode(int data)
	{
		this.data = data;
		left = right = null;
	}	
}


public class LCABST {
	
	LCANode root;
	
	public LCANode lcaBST(LCANode root, int n1, int n2)
	{
		while(root != null)
		{
			if(root.data > n1 && root.data > n2)
			{
				root = root.left;
			}
			else if(root.data < n1 && root.data < n2)
			{
				root = root.right;
			}
			else {
				break;
			}
		}
		
		return root;
	}
	
	
	public static void main(String[] args) {
	
	LCABST tree = new LCABST();
	
	tree.root = new LCANode(8);
	tree.root.left = new LCANode(4);
	tree.root.right = new LCANode(12);
	tree.root.left.left = new LCANode(2);
	tree.root.left.right = new LCANode(6);
	tree.root.right.left = new LCANode(10);
	tree.root.right.right = new LCANode(14);
	
	int n1 = 10, n2 = 14;
	
	LCANode temp = tree.lcaBST(tree.root, n1, n2);
	
	System.out.println("LCA of BST of "+n1+ " and "+ n2+" is "+temp.data);
	
	n1 = 2;
	n2 = 6;
	
	LCANode temp2 = tree.lcaBST(tree.root, n1, n2);
	
	System.out.println("LCA of BST of "+n1+ " and "+ n2+" is "+temp2.data);
	}

}

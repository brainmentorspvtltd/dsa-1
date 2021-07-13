package com.dit.dsa.tree;

class CNode {
	
	int data;
	CNode left, right;
	
	public CNode(int data)
	{
		this.data = data;
		left = right = null;
	}
	
}

public class ChildrenSum {
	
	CNode root;
	
	int checkChildrenSum(CNode node)
	{
		int leftData = 0, rightData = 0;
		
		if(node == null || node.left == null && node.right == null)
		{
			return 1;
		}
		else {
			
			if(node.left != null)
			{
				leftData = node.left.data;
			}
			
			if(node.right != null)
			{
				rightData = node.right.data;
			}
			
			if((node.data == leftData + rightData) && (checkChildrenSum(node.left) != 0 && (checkChildrenSum(node.right) != 0)))
			{
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
	
		ChildrenSum tree = new ChildrenSum();
		
		tree.root = new CNode(10);
		tree.root.left = new CNode(8);
		tree.root.right = new CNode(2);
		tree.root.left.left = new CNode(3);
		tree.root.left.right = new CNode(5);
		
		if(tree.checkChildrenSum(tree.root) != 0)
		{
			System.out.println("Satisfied the Children Sum Property");
		}
		else {
			System.out.println("Not Satisfied the Children Sum Property");
		}
		
	}
}

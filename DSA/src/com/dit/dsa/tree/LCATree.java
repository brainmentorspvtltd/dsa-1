package com.dit.dsa.tree;

class LNode {
	
	int data;
	LNode left, right;
	
	LNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class LCATree {
	
	LNode root;
	
	LNode findLCA(int n1, int n2)
	{
		return findLCA(root, n1, n2);
	}
	
	LNode findLCA(LNode node, int n1, int n2)
	{
		if(node == null)
		{
			return null;
		}
		
		if(node.data == n1 || node.data == n2)
		{
			return node;
		}
		
		LNode leftLCA = findLCA(node.left, n1, n2);
		LNode rightLCA = findLCA(node.right, n1, n2);
		
		//if both the subtrees are  not null that means LCA is present in one of the tree
		if(leftLCA != null && rightLCA != null)
		{
			return node;
		}
		
		//check for if left subtree lca and right subtree
		return (leftLCA != null) ? leftLCA : rightLCA;
		
	}
	
	public static void main(String[] args) {
		
		LCATree tree = new LCATree();
		
		tree.root = new LNode(1);
		tree.root.left = new LNode(2);
		tree.root.right = new LNode(3);
		tree.root.left.left = new LNode(4);
		tree.root.left.right = new LNode(5);
		tree.root.right.left = new LNode(6);
		tree.root.right.right = new LNode(7);
		
		System.out.println(tree.findLCA(4, 5).data);
		
	}
}

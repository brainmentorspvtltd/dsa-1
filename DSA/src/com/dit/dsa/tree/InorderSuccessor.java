package com.dit.dsa.tree;

class InNode{
	
	int data;
	InNode left, right;
	
	InNode(int data)
	{
		this.data= data;
		left = right = null;
	}
	
}

public class InorderSuccessor {
	
	InNode root;
	
	static class PrevNode {
		InNode pNode;
		PrevNode()
		{
			pNode = null;
		}
	}
	
	public void inOrderSuccessor(InNode root, PrevNode preNode, int searchNode)
	{
		if(root.right != null)
		{
			inOrderSuccessor(root.right, preNode, searchNode);
		}
		
		if(root.data == searchNode)
		{
			System.out.println("Inorder Successor of "+searchNode+ " is:" +((preNode.pNode != null) ? preNode.pNode.data : "null"));
		}
		
		preNode.pNode = root;
		
		if(root.left != null)
		{
			inOrderSuccessor(root.left, preNode, searchNode);
		}
		
	}
	
	public static void main(String[] args) {
		
		InorderSuccessor tree = new InorderSuccessor();
		
		tree.root = new InNode(1);
		tree.root.left = new InNode(2);
		tree.root.right = new InNode(3);
		tree.root.left.left = new InNode(4);
		tree.root.left.right = new InNode(5);
		
		tree.inOrderSuccessor(tree.root, new PrevNode(), 4);
		
		
	}

}

package com.dit.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelNode {
	int data;
	LevelNode left, right;
	
	public LevelNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

	public class LevelOrderTraversal {
	
	LevelNode root;
	
	void printLevelOrder()
	{
		Queue<LevelNode> queue = new LinkedList<LevelNode>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			LevelNode tempNode = queue.poll();
			System.out.print(tempNode.data +" ");
			
			//enqueue left child 
			if(tempNode.left != null)
			{
				queue.add(tempNode.left);
			}
			
			//enqueue right child
			if(tempNode.right != null)
			{
				queue.add(tempNode.right);
			}
		}
	}

	public static void main(String[] args) {
		
		LevelOrderTraversal tree = new LevelOrderTraversal();
		
		tree.root = new LevelNode(1);
		tree.root.left = new LevelNode(2);
		tree.root.right = new LevelNode(3);
		tree.root.left.left = new LevelNode(4);
		tree.root.left.right = new LevelNode(5);
		
		System.out.println("Level Order Traversal");
		tree.printLevelOrder();
	}
}

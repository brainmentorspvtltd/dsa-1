package com.dit.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthTree {

	static class Node {
		int data;
		Node left, right;
		
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static int maxWidth(Node root)
	{
		if(root ==null)
		{
			return 0;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		int maxWidth = 0;
		
		while(!queue.isEmpty())
		{
			int count = queue.size();
			
			//update the maxWidth Count
			maxWidth = Math.max(maxWidth, count);
			
			//Iterate for all the nodes in the queue
			while(count --> 0)
			{
				//dequeue an node from queue
				Node temp = queue.remove();
				
				if(temp.left != null)
				{
					queue.add(temp.left);
				}
				
				if(temp.right != null)
				{
					queue.add(temp.right);
				}
			}
		}
		
		return maxWidth;
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(8);
		root.right.right.left = new Node(6);
		root.right.right.right = new Node(7);
		
		System.out.println("Maximum Width is "+maxWidth(root));
		
	}
}

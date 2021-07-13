package com.dit.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.dit.dsa.tree.MaxWidthTree.Node;

public class PrintLeftView {
	
	static class Node {
		
		int data;
		Node left, right;
		
		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
		
	}
	
	public static void printLeftView(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			//number of nodes at current level
			int n = queue.size();
			
			//traverse all nodes at current level
			for(int i = 1; i <= n; i++)
			{
				Node temp = queue.poll();
				
				//print the left most element at the level
				if(i == 1)
				{
					System.out.print(temp.data+" ");
				}
				
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
		
		printLeftView(root);
	}
}

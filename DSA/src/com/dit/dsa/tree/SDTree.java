package com.dit.dsa.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SDNode {
	int data;
	SDNode left;
	SDNode right;
	
	SDNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class SDTree {
	
	SDNode root;
	static int temp;
	
	//Encode the tree in a single String
	public static String serialize(SDNode root)
	{
		if(root == null)
		{
			return null;
		}
		
		Stack<SDNode> stack = new Stack<>();
		stack.push(root);
		
		List<String> list = new ArrayList<>();
		
		while(!stack.isEmpty())
		{
			SDNode temp = stack.pop();
			//if current node is NULL, then we need marker 
			if(temp == null)
			{
				list.add("#");
			}
			else {
				list.add(temp.data+"");
				stack.push(temp.right);
				stack.push(temp.left);
			}
		}
		
		return String.join(",", list);
		
	}
	
	public static SDNode helper(String arr[])
	{
		if(arr[temp].equals("#"))
		{
			return null;
		}
		
		SDNode root = new SDNode(Integer.parseInt(arr[temp]));
		
		temp++;
		
		root.left = helper(arr);
		
		temp++;
		
		root.right = helper(arr);
		
		return root;
	}
	
	//Decode your encode data of tree
	public static SDNode deserialize(String data)
	{
		if(data == null)
		{
			return null;
		}
		
		temp = 0;
		
		String arr[] = data.split(",");
		return helper(arr);
	}
	
	static void inOrder(SDNode node)
	{
		if(node == null)
		{
			return;
		}
		
		inOrder(node.left);
		
		System.out.print(node.data+" ");
		
		inOrder(node.right);
		
	}
	
	public static void main(String[] args) {
		
		SDTree tree = new SDTree();
		tree.root = new SDNode(20);
		tree.root.left = new SDNode(8);
		
		tree.root.right = new SDNode(22);
		/*tree.root.left.left = new SDNode(4);
		tree.root.left.right = new SDNode(12);
		tree.root.left.right.left = new SDNode(10);
		tree.root.left.right.right = new SDNode(14);
		*/
		
		String serialized = serialize(tree.root);
		
		System.out.println("Serialized Tree "+serialized);
		
		SDNode rNode = deserialize(serialized);
		
		System.out.println("Inorder Traversal: ");
		inOrder(rNode);
		
	}

}

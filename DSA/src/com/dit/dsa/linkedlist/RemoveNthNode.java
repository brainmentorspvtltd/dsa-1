package com.dit.dsa.linkedlist;

public class RemoveNthNode {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static RemoveNthNode insert(RemoveNthNode list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null)
		{
			list.head = newNode;
		}
		else {
			Node traverse = list.head;
			
			while(traverse.next != null)
			{
				traverse = traverse.next;
			}
			
			traverse.next = newNode;
		}
		
		return list;
	}
	
	public static Node removeNthNode(RemoveNthNode list, int n)
	{
		Node first = list.head;
		Node second = list.head;
		
		for(int i = 1; i <= n + 1; i++)
		{
			first = first.next;
		}
		
		while(first != null)
		{
			first = first.next;
			second = second.next;
		}
		
		second.next = second.next.next;
		
		return list.head;
	}
	
	
	public static void printList(RemoveNthNode list)
	{
		Node traverse = list.head;
		
		System.out.println("\nLinked List");
		while(traverse != null)
		{
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		RemoveNthNode list = new RemoveNthNode();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 2);
		list = insert(list, 2);
		list = insert(list, 1);
		
		printList(list);
		
		removeNthNode(list, 2);
		
		printList(list);

	}

}

package com.dit.dsa.linkedlist;

public class KthNode {
	
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
	
	public static KthNode insert(KthNode list, int data)
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
	
	public static void printList(KthNode list)
	{
		Node traverse = list.head;
		
		System.out.println("Linked List ");
		while(traverse != null)
		{
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
	}
	
	public static void kthNode(KthNode list, int kth)
	{
		Node p, q;
		p = q = list.head;
		
		for(int i = 1; i <= kth; i++)
		{
			q = q.next;
		}
		
		while(q != null)
		{
			p = p.next;
			q = q.next;
		}
		
		System.out.println("\nKth Element "+p.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KthNode list = new KthNode();
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		list = insert(list, 60);
		list = insert(list, 70);
		
		//printing
		printList(list);
		
		//kthNode
		kthNode(list, 2);
		
	    //printList(list);
		

	}

}

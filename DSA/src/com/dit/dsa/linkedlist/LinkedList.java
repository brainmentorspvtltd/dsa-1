package com.dit.dsa.linkedlist;

public class LinkedList {
	
	Node head; // head or start node of a list
	
	static class Node {
		
		int data;
		Node next;
		
		//constructor
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	//insertion in a list
	public static LinkedList insert(LinkedList list, int data)
	{
		//create a new node
		Node newNode = new Node(data);
		newNode.next = null;
		
		//if the linked list is empty
		if(list.head == null)
		{
			list.head = newNode;
		}
		else { // if list is not empty
			
			Node traverse = list.head; 
			
			while(traverse.next != null)
			{
				traverse = traverse.next; // traverse/move to next node
			}
			
			traverse.next = newNode;
		}
		
		return list;
	}
	
	public static void printList(LinkedList list)
	{
		Node traverse = list.head;
		
		System.out.println("Linked List ");
		while(traverse != null)
		{
			System.out.print(traverse.data + "  ");
			traverse = traverse.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		//insertion
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		list = insert(list, 60);
		
		//printing
		printList(list);
	
	}

}

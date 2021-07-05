package com.dit.dsa.linkedlist;

import com.dit.dsa.linkedlist.LinkedList.Node;

public class ReverseLinkedList {
	
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
	public static ReverseLinkedList insert(ReverseLinkedList list, int data)
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
	
	public static void reverseList(ReverseLinkedList list)
	{
		Node prevNode, curNode;
		
		//if list is not empty
		if(list.head != null)
		{
			prevNode = list.head;
			curNode = list.head.next;
			list.head = list.head.next;
			
			prevNode.next = null; // make first node as last node
			
			while(list.head != null)
			{
				list.head = list.head.next;
				curNode.next = prevNode;
				
				prevNode = curNode;
				curNode = list.head;			
			}
			
			list.head = prevNode;
		}
	}
	
	public static void printList(ReverseLinkedList list)
	{
		Node traverse = list.head;
		
		System.out.println("\nLinked List ");
		while(traverse != null)
		{
			System.out.print(traverse.data + "  ");
			traverse = traverse.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList list = new ReverseLinkedList();
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		printList(list);
		
		reverseList(list);
		
		printList(list);
	}

}

package com.dit.dsa.linkedlist;

public class FindMiddleElement {

	Node head; // head of a linked list
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	//insertion
	
	public static FindMiddleElement insert(FindMiddleElement list, int data)
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
				traverse = traverse.next; // traverse mode to next node
			}
			
			traverse.next = newNode;
			
		}
		
		return list;
	}
	
	public static void printList(FindMiddleElement list)
	{
		Node traverse = list.head;
		
		System.out.println("Linked List");;
		while(traverse != null)
		{
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
	}
	
	public static void midPoint(FindMiddleElement list)
	{
		Node slow = list.head;
		Node fast = list.head;
		
		if(list.head != null)
		{
			while(fast != null && fast.next != null) // even or odd checking
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			
			System.out.println("\nMiddle Element "+slow.data);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindMiddleElement list = new FindMiddleElement();
		
		//insertion
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		//printing
		printList(list);
		
		//Middle Element
		midPoint(list);
		

	}

}

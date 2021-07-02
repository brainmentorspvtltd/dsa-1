package com.dit.dsa.linkedlist;

public class LinkedListDeletion {
	
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
	
	
	public static LinkedListDeletion insert(LinkedListDeletion list,int data)
	{
		//create a new node
		Node newNode = new Node(data);
		
		//if list is empty
		if(list.head==null)
		{
			list.head = newNode;
		}		
		
		else { // if list is not empty
			Node trv = list.head;
			
			while(trv.next !=null)
			{
				trv = trv.next;
			}
			
			trv.next = newNode;			
		}	
		
		return list;
	}
	
	//Deletion by position
	public static LinkedListDeletion delete(LinkedListDeletion list, int position)
	{
		if(list.head == null)
		{
			System.out.println("List is Empty. You can't Delete");
			return null;
		}
		
		Node currentNode = list.head;
		
		//If position is 0 then head(first) node itself is to be deleted node 
		if(position == 0 && currentNode != null)
		{
			list.head = currentNode.next; // updated head position from 1 node to 2 node
			
			return list;
		}
		
		//if the position is greater than 0 		
		int counter = 0;
		Node prevNode = null;
	
		while(currentNode != null)
		{
			if(counter == position)
			{
				prevNode.next = currentNode.next;
				break;
			}
			else { // counter is not equal to position then move to the next node and again compare
				
				prevNode = currentNode;
				currentNode = currentNode.next;
				counter++;
			}
		}
		
		//case 3: if position is greater than size of the linked list
		if(currentNode == null)
		{
			System.out.print("\nPosition is not found");
		}
		
		return list;
	}
	
	public static void printList(LinkedListDeletion list)
	{
		if(list.head == null)
		{
			System.out.println("\nList is Empty");
			return;
		}
		else { // if list is not empty
			Node trav = list.head;
			
			System.out.println("\nLinked List");
			while(trav != null)
			{
				System.out.print(trav.data + " ");
				trav=trav.next;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListDeletion list = new LinkedListDeletion();
		
		//insertion
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		//printing
		printList(list);
		
		//Deletion
		delete(list, 0);
		
		printList(list);
		
		//Deletion
		delete(list, 2);
				
		printList(list);
		
		//Deletion
		delete(list, 10);
						
		printList(list);
		
		//Deletion
		delete(list, 2);
						
		printList(list);
		
		list = insert(list, 60);
		
		printList(list);
		
		delete(list, 0);
		printList(list);
		delete(list, 0);
		printList(list);
		delete(list, 0);
		printList(list);
		
		delete(list, 0);
	}

}

package com.dit.dsa.linkedlist;

public class PalindromeLL {
	
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
	
	public static PalindromeLL insert(PalindromeLL list, int data)
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
	
	public static Node reverseLinkedList(Node start)
	{
		Node newHead = null;
		
		while(start != null)
		{
			Node temp = start.next;
			start.next = newHead;
			newHead = start;
			start = temp;
		}
		
		return newHead;
	}
	
	public static int checkPalindrome(PalindromeLL list)
	{
		if(list.head == null)
		{
			System.out.println("Invalid Operation");
		}
		
		Node slow = list.head;
		Node fast = list.head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node firstHalfHead = list.head;
		Node secondHalfHead = reverseLinkedList(slow.next);
		
		while(firstHalfHead != null && secondHalfHead != null)
		{
			if(firstHalfHead.data != secondHalfHead.data) {
				System.out.println("\nNot a Palindrome Linked List");
				return 0;
			}
			
			firstHalfHead = firstHalfHead.next;
			secondHalfHead = secondHalfHead.next;
		}
		
		
		System.out.println("\nPalindrome Linked List");
		return 1;
		
	}
	
	public static void printList(PalindromeLL list)
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
	
		PalindromeLL list = new PalindromeLL();
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 2);
		list = insert(list, 2);
		list = insert(list, 1);
		
		printList(list);
		
		checkPalindrome(list);

	}

}

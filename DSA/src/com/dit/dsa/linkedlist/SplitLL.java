package com.dit.dsa.linkedlist;

public class SplitLL {
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	static void splitLL(Node head, int p, int q)
	{
		int n = 0;
		Node temp;
		temp = head;
		
		//get length of a list
		while(temp != null)
		{
			n++;
			temp = temp.next;
		}
		
		//check if length exceeds the limit 
		if(p + q > n)
		{
			System.out.println("-1");
			return;
		}
		
		temp = head;
		
		while(p > 1)
		{
			temp = temp.next;
			p--;
		}
		
		Node head2 = temp.next;
		temp.next = null;
		
		//first linked list
		printList(head);
		System.out.println();
		
		//second linked list
		printList(head2);
	}

	static void printList(Node head)
	{
		if(head == null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printList(head.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(5);
		head.next.next.next = new Node(6);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(2);
		
		//int p = 4, q = 3; // error
		int p = 4, q = 2;
		
		splitLL(head, p, q);

	}

}

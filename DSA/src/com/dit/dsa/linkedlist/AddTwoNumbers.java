package com.dit.dsa.linkedlist;

class ListNode {
	int data;
	ListNode next;
	
	ListNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class AddTwoNumbers {
	
	static ListNode head1, head2;
	static ListNode resultStart = null;
	
	static void add2Numbers(ListNode first, ListNode second)
	{
		int sum = 0;
		int quo = 0;
		int remainder = 0;
		
		ListNode temp = null;
		
		while(first != null || second != null)
		{
			sum = quo + ((first != null ? first.data : 0) + (second != null ? second.data : 0));
			
			remainder = sum % 10;
			quo = sum / 10;
			
			if(temp == null)
			{
				temp = new ListNode(remainder);
				resultStart = temp;
			}
			else {
				temp.next = new ListNode(remainder);
			}
			
			if(first != null)
			{
				first = first.next;
			}
			
			if(second !=  null)
			{
				second = second.next;
			}
			
		}
		
		if(quo > 0)
		{
			temp.next = new ListNode(remainder);
			temp = temp.next;
		}

	}
	
	static void printList(ListNode head)
	{
		if(head == null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printList(head.next);
	}
	
	
	public static void main(String[] args) {
		
		AddTwoNumbers obj = new AddTwoNumbers();
		
		head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(3);
		
		System.out.println("List A ");
		obj.printList(head1);
		
		head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(4);
	
		System.out.println("\nList B ");
		obj.printList(head2);
		
		obj.add2Numbers(head1, head2);
		
		System.out.println("\nAddition of two LL ");
		obj.printList(resultStart);
	}

}

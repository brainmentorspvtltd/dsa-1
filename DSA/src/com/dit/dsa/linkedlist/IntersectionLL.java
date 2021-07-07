package com.dit.dsa.linkedlist;

class LLNode {
	int data;
	LLNode next;
	
	LLNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class IntersectionLL {
	
	static LLNode head1, head2;
	
	int getSize(LLNode node)
	{
		LLNode current = node;
		int count = 0;
		
		while(current != null)
		{
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	int getNode()
	{
		int c1 = getSize(head1);
		int c2 = getSize(head2);
		int d;
		
		if(c1 > c2)
		{
			d = c1 - c2;
			return getIntersection(d, head1, head2);
		}
		else {
			d = c2 - c1;
			return getIntersection(d, head2, head1);
		}
	}

	int getIntersection(int d, LLNode n1, LLNode n2)
	{
		LLNode current1 = n1;
		LLNode current2 = n2;
		
		for(int i = 0; i < d; i++)
		{
			if(current1 != null)
			{
				return -1;
			}
			current1 = current1.next;
		}
		
		while(current1 != null && current2 != null)
		{
			if(current1.data == current2.data)
			{
				return current1.data;
			}
			
			current1 = current1.next;
			current2 = current2.next;
		}
		
		return -1;
	}
	
	void print(LLNode head)
	{
		LLNode temp = head;
		
		while(temp != null)
		{
			System.out.println("Node is "+temp.data);
			temp = temp.next;
		}
		
		System.out.println("*************************************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntersectionLL obj = new IntersectionLL();
		
		head1 = new LLNode(10);
		head1.next = new LLNode(20);
		head1.next.next = new LLNode(30);
		head1.next.next.next = new LLNode(40);
		head1.next.next.next.next = new LLNode(50);
		
		obj.print(head1);
		
		head2 = new LLNode(11);
		head2.next = new LLNode(12);
		head2.next.next = new LLNode(13);
		head2.next.next.next = new LLNode(40);
		head2.next.next.next.next = new LLNode(50);
		
		obj.print(head2);
		
		System.out.println("Intersection Point is "+obj.getNode());

	}

}

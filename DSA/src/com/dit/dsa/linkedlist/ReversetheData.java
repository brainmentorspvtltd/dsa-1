package com.dit.dsa.linkedlist;

class Node {
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class ReversetheData {
	
	Node start;
	
	void insert(Node node)
	{
		if(start == null)
		{
			start = node;
			return;
		}
		
		Node current = start;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = node;
	}
	
	//get length of the LL
	int getSize()
	{
		Node temp = start;
		int size = 0;
		
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		
		return size;
	}
	
	//Get node of a particular index
	Node getNode(int index)
	{
		int size = getSize();
		
		if(size == 0)
		{
			System.out.println("Linked List is Empty");
		}
		
		//Boundary Case
		if(index < 0 || index >= size) // 0 to size - 1
		{
			System.out.println("Invalid Index");
		}
		
		Node temp = start;
		for(int i = 1; i <= index; i++)
		{
			temp = temp.next;
		}
		
		return temp;
	}
	
	void reverseData()
	{
		int left = 0;
		int right = getSize() - 1;
		
		while(left < right)
		{
			Node leftNode = getNode(left); // 10
			Node rightNode = getNode(right); // 50
			
			int temp = leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			
			left++;
			right--;
		}
	}
	
	void printList()
	{
		Node temp = start;
		
		while(temp != null)
		{
			System.out.println("Node is: "+temp.data);
			System.out.println("Address is: "+temp.next);
			temp = temp.next;
		}
		
		System.out.println("*****************************************");
	}
	
	public static void main(String[] args) {
		
		ReversetheData reverseData = new ReversetheData();
		reverseData.insert(new Node(10));
		reverseData.insert(new Node(20));
		reverseData.insert(new Node(30));
		reverseData.insert(new Node(40));
		reverseData.insert(new Node(50));
		
		System.out.println("Before Data Reverse");
		reverseData.printList();
		
		System.out.println("After Data Reverse");
		reverseData.reverseData();
		reverseData.printList();
	
	}

}

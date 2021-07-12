package com.dit.dsa.queue;

class CirQueue {
	
	int arr[];
	int rear;
	int front;
	final int DEFAULT_CAPACITY = 10;
	
	CirQueue()
	{
		arr = new int[DEFAULT_CAPACITY];
		rear = front = 0;
	}
	
	CirQueue(int capacity) // capacity = 5
	{
		if(capacity < 1)
		{
			throw new RuntimeException("Invalid Capacity Set");
		}
		arr = new int[capacity];
		rear = front = 0;
	}
	
	void enqueue(int data)
	{
		if(rear == arr.length)
		{
			throw new RuntimeException("Queue is Full");
		}
		
		int availableIndex = (front + rear) % arr.length;
		arr[availableIndex] = data;
		rear++;
	}
	
	int dequeue()
	{
		if(rear == 0)
		{
			throw new RuntimeException("Queue is Empty");
		}
		
		int data = arr[front];
		arr[front] = 0;
		front = (front + 1) % arr.length;
		
		rear--;
		
		return data;
		
	}
	
	void print()
	{
		for(int i = 0; i < rear; i++)
		{
			int availableIndex = (front + i) % arr.length;
			System.out.print(arr[availableIndex]+" ");
		}
		
		System.out.println();
	}
	
}

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CirQueue queue = new CirQueue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.print();
		
		queue.dequeue();
		queue.enqueue(60);
		
		queue.print();
		
	}

}

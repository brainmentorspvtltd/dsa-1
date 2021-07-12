package com.dit.dsa.queue;

class QNode {
	int key;
	QNode next;
	
	QNode(int key)
	{
		this.key = key;
		this.next = null;
	}
}

class QueueLL {
	QNode front, rear;
	
	public QueueLL()
	{
		this.front = this.rear = null;
	}
	
	void enqueue(int key)
	{
		QNode temp = new QNode(key);
		
		//if queue is empty, then new node is front and rear both
		if(this.rear == null)
		{
			this.front = this.rear = temp;
			
			return;
		}
		
		//If queue is not empty
		this.rear.next = temp;
		this.rear = temp;
	}
	
	void dequeue()
	{
		if(this.front == null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null)
		{
			this.rear = null;
		}
	}
	
}

public class QueueUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLL queue = new QueueLL();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.dequeue();
		
		System.out.println("Front Value of Queue "+queue.front.key);
		
		System.out.println("Rear Value of Queue "+queue.rear.key);
	}

}

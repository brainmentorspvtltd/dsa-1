package com.dit.dsa.stack;

class Stacks {
	int size;
	int top1, top2;
	int arr[];
	
	Stacks(int n)
	{
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	
	void push1(int value)
	{
		if(top1 < top2 - 1)
		{
			top1++;
			arr[top1] = value; 
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	void push2(int value)
	{
		if(top1 < top2 - 1)
		{
			top2--;
			arr[top2] = value;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	int pop1()
	{
		if(top1 >= 0)
		{
			int value = arr[top1];
			top1--;
			return value;
		}
		else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		return 0;
	}
	
	int pop2()
	{
		if(top2 <= size)
		{
			int value = arr[top2];
			top2++;
			return value;					
		}
		else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		return 0;
	}
}

public class TwoStacksOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stacks s = new Stacks(5);
		
		s.push1(5);
		s.push1(10);
		s.push2(15);
		s.push2(20);
		s.push2(25);
		s.push1(40);

		System.out.println("Popped Element from stack1 "+s.pop1());
		
		System.out.println("Popped Element from stack2 "+s.pop2());

	}

}

package com.dit.dsa.stack;

class TwoStacks{
	int arr[];
	int size;
	int top1, top2;
	
	TwoStacks(int n)
	{
		size = n;
		arr= new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}
	
	//push 1 for stack 1
	void push1(int value)
	{
		if(top1 > 0)
		{
			top1--;
			arr[top1] = value;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	int pop1()
	{
		if(top1 <= size / 2)
		{
			int value = arr[top1];
			top1++;
			return value;
		}
		else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		return 0;
	}
	
	//push 2 for stack 2
	void push2(int value)
	{
		if(top2 < size - 1)
		{
			top2++;
			arr[top2] = value;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	int pop2()
	{
		if(top2 >= size / 2 + 1)
		{
			int value = arr[top2];
			top2--;
			return value;
		}
		else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		return 0;
	}
}

public class TwoStackNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStacks s = new TwoStacks(5);
		
		s.push1(5);
		s.push1(10);
		s.push2(15);
		s.push2(20);
		s.push2(25); // Stack Overflow in Stack 2
		s.push1(40);

		System.out.println("Popped Element from stack1 "+s.pop1());
		
		System.out.println("Popped Element from stack2 "+s.pop2());
		
	}

}

// usage of .length in arrays sampple using stack

import java.util.*;

class Stack {
	private int stack[];
	public int top_of_stack;
	private int bottom_of_stack;
	
	Stack(int size){
		stack = new int[size];
		top_of_stack = 0;
		bottom_of_stack = stack.length-1;
		
	}
	
	void push(int ele){
		if (top_of_stack == stack.length - 1) System.out.println("Stack is full.");
		else {
			top_of_stack += 1;
			stack[bottom_of_stack] = ele;
			bottom_of_stack -=1;
		}
		System.out.println("Elements in the stack are : ");
		for(int i =0; i<stack.length; i++) System.out.println(stack[i]);
		
	}
	
	int pop(){
		if (top_of_stack == -1){ 
			System.out.println("Stack underflow.");
			return 0;
		} else {
			top_of_stack -= 1;
			System.out.println("The top element = "+stack[top_of_stack]);
			return stack[top_of_stack];
		}
	}
}

class TestStack2 {
	public static void main(String args[]){
		Stack obj1 = new Stack(5);
		Stack obj2 = new Stack(7);
		
		for(int i=1; i<6; i++) obj1.push(i*2);
		//for(int i=1; i<8; i++) obj2.push(i*2);
		System.out.println("The top_of_stack = "+obj1.top_of_stack);
		
		System.out.println("the popped elements are : "+obj1.pop());
		
	}
}
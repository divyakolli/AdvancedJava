package AdvJavaExam;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Q1_dynamicSizedStack {
	//Implementing Stack
	int stackSize;
	int[] stackArray1;
	int top;

	Q1_dynamicSizedStack(int size){	
		this.stackSize = size;
		stackArray1 = new int[stackSize];
		top = -1;
	}

	//This method is being used to add element into the stack
	public void push_method(int element) {
		if(top==stackSize-1) {
			System.out.println("**********Stack is full: Calling method to increase the stack size**********");
			increaseStack_Size();
		}
		stackArray1[++top] = element;
		System.out.println(element + " has been added to the stack");
	}

	//This method is being used to remove element from the stack
	public void pop_method() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		int deleteElement = stackArray1[top--];
		System.out.println(deleteElement + " has been removed from the stack");

	}

	//This methods is used to display the top element
	public void peek_method() {
		if(top>-1) {
			System.out.println("The top element in the stack is : " + stackArray1[top]);
		}
		else
			System.out.println("Stack is empty");
	}

	//This method is being used to increase the size of the existing stack
	public void increaseStack_Size() {
		int newSize = stackSize*2;
		int[] stackArray2 = new int[newSize];
		for(int i=0; i<stackSize; i++) {
			stackArray2[i] = stackArray1[i];
		}
		stackArray1 = stackArray2;
		stackSize = newSize;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of stack : ");
		int size = input.nextInt();

		Q1_dynamicSizedStack stack = new Q1_dynamicSizedStack(size);
		stack.push_method(10);
		stack.push_method(20);
		stack.push_method(30);
		stack.push_method(40);
		stack.push_method(50);
		stack.push_method(60);

		System.out.println("**********************************************");

		stack.pop_method();

		System.out.println("**********************************************");

		stack.peek_method();
	}
}

/*
//By using Stack from util package
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	//Adding the elements to stack
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	stack.push(6);
	System.out.println("Dynamic stack : " + stack);

	//Printing the element, which is at the top of the stack
	System.out.println("Top of the element in the Stack is : " + stack.peek());

	//Removing the element from the top of the stack
	System.out.println("Removing the element from the top element in the Stack : " + stack.pop());

	System.out.println("After removing the element, Dynamic stack : " + stack);	
}
 */
package List;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class MyStack {
	public static int top = -1;
	public int size = 10;
	
	static int[] arr = new int[10];
	
	public static void main(String[] args) {
		
	}
	
	public void push(int item) {
		if(top == (size-1)) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			arr[top] = item;
			System.out.println("Item has been inserted");
		}
	}
	
	public void pop(int item) {
		if(top == -1) {
			System.out.println("Stack is empty");
		}else {
			top--;
		}
	}
}

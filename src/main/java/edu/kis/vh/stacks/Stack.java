package edu.kis.vh.stacks;

import java.util.ArrayList;

/**
 * @author Przemyslaw
 *
 */
public class Stack {

	private StackArray stackArray = new StackArray();

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public Stack() {
		this.stackArray = new StackArray();
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}
	
}

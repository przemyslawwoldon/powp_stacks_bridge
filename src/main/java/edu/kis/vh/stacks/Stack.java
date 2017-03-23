package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Przemyslaw
 *
 */
public class Stack {

	private StackList stackList;

	public Stack(StackList stackArray) {
		super();
		this.stackList = stackArray;
	}
	
	public Stack() {
		this.stackList = new StackList();
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}
	
	public int getTotal() {
		return stackList.getI();
	}
	
}

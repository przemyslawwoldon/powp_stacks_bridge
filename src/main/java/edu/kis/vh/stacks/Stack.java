package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 12;

	private int[] items = new int[FULL_STACK_VALUE];
	public int total = EMPTY_STACK_VALUE;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

}

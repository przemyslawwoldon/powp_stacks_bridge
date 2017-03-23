package edu.kis.vh.stacks;

public class StackArray {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 12;

	private final int[] items = new int[FULL_STACK_VALUE];
	private int total = EMPTY_STACK_VALUE;

	/**
	 * This method adds new element to stack
	 * @param i This is an element to be pushed on stack
	 */
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/**
	 * This method checks if stack is empty
	 * @return This returns true if stack is empty else false 
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/**
	 * This method checks if stack is full
	 * @return This returns true if stack is full else false 
	 */
	public boolean isFull() {
		return total == FULL_STACK_VALUE - 1;
	}

	/**
	 * This method returns value at the top of the stack
	 * @return This returns a top value from stack
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	/**
	 * This method extracts value from the stack
	 * @return This returns extracted value from stack
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

	/**
	 * This method gets value of total
	 * @return This returns value of total
	 */
	public int getTotal() {
		return total;
	}

}

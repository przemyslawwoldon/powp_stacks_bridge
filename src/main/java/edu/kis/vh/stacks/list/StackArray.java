package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.StackVector;

public class StackArray implements StackVector {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 12;

	private final int[] items = new int[FULL_STACK_VALUE];
	private int total = EMPTY_STACK_VALUE;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == FULL_STACK_VALUE - 1;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

}

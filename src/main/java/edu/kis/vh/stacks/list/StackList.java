package edu.kis.vh.stacks.list;

class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	
	private class Node {
		
		final int value;
		Node prev, next;

		protected Node(int i) {
			value = i;
		}

	}	
	
	private Node last;
	//int i;

	protected void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	private boolean empty() {
		return last == null;
	}

	protected boolean full() {
		return false;
	}

	protected int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	protected int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

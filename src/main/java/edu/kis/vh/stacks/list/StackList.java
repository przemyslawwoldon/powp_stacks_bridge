package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	
	private class Node {
		
		final int value;
		Node prev, next;

		protected Node(int i) {
			value = i;
		}

	}	
	
	private Node last;
	private int i = EMPTY_STACK_VALUE;

	public void pushElement (int i) {
		this.i += 1;
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		this.i -= 1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	public int getI() {
		return i;
	}

}

//1.source generate delagate method
//2.alt + shift + r 
//generacja metod z klasy StackList
//nastepnie zamiana ich nazw

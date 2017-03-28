package edu.kis.vh.stacks.collections.list;

public interface StackVector {

	int EMPTY_STACK_VALUE = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}
package edu.kis.vh.stacks.collections.list;

public interface StackVector {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

	int getTotal();

}
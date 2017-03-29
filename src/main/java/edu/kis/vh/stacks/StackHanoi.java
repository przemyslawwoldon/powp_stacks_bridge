package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;
import edu.kis.vh.stacks.collections.list.StackVector;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackVector stackVector) {
		super(stackVector);
		// TODO Auto-generated constructor stub
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}

}

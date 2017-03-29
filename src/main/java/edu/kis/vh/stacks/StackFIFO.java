package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;

public class StackFIFO extends Stack {

	private final Stack temp = new Stack();

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackList stackArray) {
		super(stackArray);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}

}

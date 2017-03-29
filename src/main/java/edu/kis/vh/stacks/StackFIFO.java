package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;

public class StackFIFO extends Stack {

	private final StackList temp = new StackList();

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackList stackList) {
		super(stackList);
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

//StackList wydaje sie lepszym wyborem, 
//poniewaz nie ustalamy z gory rozmiaru stosu dzieki czemu nie jestesmy nim ograniczeni,
//zasoby sa przydzielane dynamicznie  
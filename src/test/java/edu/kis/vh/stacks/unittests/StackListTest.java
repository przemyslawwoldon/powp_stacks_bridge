package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.list.StackList;

public class StackListTest {

	@Test
	public void testPushElement() {
		StackList stackList = new StackList();
		int testValue = 5;
		stackList.pushElement(testValue);
		int result = stackList.peek();
		
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testEmpty() {
		StackList stackList = new StackList();
		boolean result = stackList.empty();

		Assert.assertEquals(true, result);
		stackList.pushElement(888);
		result = stackList.empty();

		Assert.assertEquals(false, result);
	}
/*
	@Test
	public void testFull() {
		StackList stackList = new StackList();
		boolean resultFull;
		for (int i = 0; i < 50; i += 1) {
			resultFull = stackList.full();
			
			Assert.assertEquals(false, resultFull);
			stackList.pushElement(i);
		}
		resultFull = stackList.full();
		
		Assert.assertEquals(false, resultFull);
	}
*/
	@Test
	public void testPeek() {
		StackList stackList = new StackList();
		final int EMPTY_STACK_VALUE = -1;
		int result = stackList.peek();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		stackList.pushElement(testValue);
		result = stackList.peek();

		Assert.assertEquals(testValue, result);
		result = stackList.peek();

		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testPop() {
		StackList stackList = new StackList();
		final int EMPTY_STACK_VALUE = -1;
		int result = stackList.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		stackList.pushElement(testValue);
		result = stackList.pop();

		Assert.assertEquals(testValue, result);
		result = stackList.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}

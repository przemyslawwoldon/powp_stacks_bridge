package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.collections.list.StackList;

public class StackListTest {

	@Test
	public void testPushElement() {
		StackList stackList = new StackList();
		int testValue = 5;
		stackList.push(testValue);
		int result = stackList.top();
		
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testEmpty() {
		StackList stackList = new StackList();
		boolean result = stackList.isEmpty();

		Assert.assertEquals(true, result);
		stackList.push(888);
		result = stackList.isEmpty();

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
		int result = stackList.top();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		stackList.push(testValue);
		result = stackList.top();

		Assert.assertEquals(testValue, result);
		result = stackList.top();

		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testPop() {
		StackList stackList = new StackList();
		final int EMPTY_STACK_VALUE = -1;
		int result = stackList.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		stackList.push(testValue);
		result = stackList.pop();

		Assert.assertEquals(testValue, result);
		result = stackList.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}

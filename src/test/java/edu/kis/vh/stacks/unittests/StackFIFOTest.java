package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	@Test
	public void testPop() {
		StackFIFO stackFIFO = new StackFIFO();
		final int EMPTY_STACK_VALUE = 0;
		int result = stackFIFO.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		stackFIFO.push(testValue);
		result = stackFIFO.pop();

		Assert.assertEquals(testValue, result);
		result = stackFIFO.pop();

		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
